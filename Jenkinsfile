#!groovy

def gv
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
           checkout scm
	   gv = load 'src/Helper.groovy'
	   gv.setParams()
	   gv.createEnv()
	   // Test
           //def helper = new src.Helper()
     }
     stage("Build") {
	       
	       echo "Build"
	       gv.cpFile()
     }
     stage("Deploy") {
	         echo "Deploy"
     }
}	  

