#!groovy

def gv
def check
String check2

//def call(Map config) {
properties([
     parameters ([
          string(
               defaultValue: 'python',
               description: 'Package you want to install',
               name: 'PACKAGE'
          )
    ])
])
node {
     stage("Test") {
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
     }
}	  

def printString(String Name) {
      check = "Yupp working!!"
  //    setParams()
      echo ("Create String '${Name}' ")
      echo ("Create String '${check}' ")
}

