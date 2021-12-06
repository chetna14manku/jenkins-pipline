//#!/usr/bin/env groovy

//import src.Helper
def gv = load "Helper.groovy"

pipeline {
   agent any
   parameters{
          string(
	       defaultValue: 'python', 
	       description: 'Package you want to install', 
	       name: 'PACKAGE'
	  )
    }

   stages {
          stage("Test") {
	      steps {
	      // Test
              //def helper = new Helper()
	      //helper.printString('${params.PACKAGE}')
	          script {
		       gv.printString('${params.PACKAGE}')
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

