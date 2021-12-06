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
	          script {
		       gv.printString('${params.PACKAGE}')
		  }
	      }
	  }
	   stage("Build") {
	      steps {
	        echo 'Build'
              }
          }
	   stage("Deploy") {
	       steps {
	         echo 'Deploy'
               }
          }
   }
}

