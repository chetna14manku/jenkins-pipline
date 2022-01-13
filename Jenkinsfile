#!groovy

def gv
def check
String check2

//def call(Map config) {
properties([
     parameters ([
          string(
               defaultValue: 'all',
               description: 'Package separated by comma you want to install',
               name: 'PACKAGE'
          )
    ])
])
node {
     stage("Test") {
	   checkLoop()  
           printString("CHETNA")
           checkout scm
	   gv = load 'src/Helper.groovy'
	   gv.printString("checkName")
	   gv.createEnv()
	   // Test
           //def helper = new src.Helper()
     }
     stage("Build") {
	       
	       echo "Build"
	     //gv.cpFile("${gv.venvDir}")
     }
     stage("Deploy") {
	         echo "Deploy"
	         archiveArtifacts artifacts: '**'
	         
     }
}	  
def checkLoop() {
	
	def packs = "${params.PACKAGE}"
	
	if ("${params.PACKAGE}" != "all") {
		packs = "${params.PACKAGE}".split(',')
	} 
	echo ("Print package param: '${packs}' ")
	for (pkg in packs) {
                def pkg1 = pkg.trim()
		echo ("Check pkg selected: xx'${pkg1}'xx ")
	}
}

def printString(String Name) {
      check = "Yupp working!!"
      check2 = "Yupp its also working!!"
  //    setParams()
      echo ("Create String '${Name}' ")
      echo ("Create String '${check}' ")
      echo ("Create String '${check2}' ")
}

