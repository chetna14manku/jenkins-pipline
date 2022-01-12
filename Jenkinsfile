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
	if ("${params.PACKAGE}" != "all") {
		def packs = ["${params.PACKAGE}"]
	} else {
		def packs = ""
	}
	echo "Print package param: '${params.PACKAGE}' "
	for (pkg in packs) {
		sh ()
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

