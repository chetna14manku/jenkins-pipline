#!groovy
//import src.Helper
def gv = load 'demo.groovy'
//def call(Map config) {

pipeline {
    agent any
    libraries {
          lib('first@master')
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
	    steps {
	      script {
	          gv.print("Hello")
	          // Test
                  //def helper = new src.Helper()
	        //helper.printString('${params.PACKAGE}')
              }
	    }
	  }

	   stage("Build") {
             steps {
	     // Build
	     }
          }
	   stage("Deploy") {
              steps {
	      // Deploy
               }
	  }

    }	  
}

