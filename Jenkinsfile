#!groovy
//import src.Helper
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
	   gv.printString("Hello")
	   // Test
           //def helper = new src.Helper()
     }
     stage("Build") {
	       echo "Build"
     }
     stage("Deploy") {
	         echo "Deploy"
     }
}	  

