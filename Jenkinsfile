
//import src.Helper
//def gv
//def call(Map config) {

pipeline {
    agent any
    libraries {
          lib('first@masteri')
    }
     parameters {
          string(
               defaultValue: 'python',
               description: 'Package you want to install',
               name: 'PACKAGE'
          )
    }

    stages {
          stage("Test") {
	      // Test
              //def helper = new src.Helper()
	      //helper.printString('${params.PACKAGE}')
	  
	   stage("Build") {
              // Build
          }
	   stage("Deploy") {
              // Deploy
          }
    }	  
}

