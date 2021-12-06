//import src.Helper
//def gv = load "Helper.groovy"
@Library(first') _

properties([
    parameters([
          string(
	       defaultValue: 'python', 
	       description: 'Package you want to install', 
	       name: 'PACKAGE'
	  )
    ])
])
//def call(Map config) {
node {
          stage("Test") {
	      // Test
	      echo "${params.PACKAGE}"
              //def helper = new src.Helper()
	      //helper.printString('${params.PACKAGE}')
	  }
	   stage("Build") {
              // Build
          }
	   stage("Deploy") {
              // Deploy
           }
}
//}
