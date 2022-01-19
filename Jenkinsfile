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
	sh "pwd"
	def l = "python java c"
	sh("""
	 cat >check.sh <<EOL
         line 1,
         line 2, 
         line 3,
         line 4 line
         ... 
          EOL
	   """)
	
	def packs = " "
	
	if ("${params.PACKAGE}" != "all") {
		packs = "${params.PACKAGE}".split(',')
	} 
	echo ("Print package param: '${packs}' ")
	for (pkg in packs) {
                def pkg1 = pkg.trim()
		echo ("Print pkg1 after tim: tt'${pkg1}'tt ")
		def check = "${(params.PACKAGE == "all") ? "" : pkg1}"
		echo ("Print pkg inside loop: oo'${check}'oo ")
		if ("1" == "1") {
			echo ("Print pkg1 inside loop: pp'${pkg1}'pp ")
		}
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

