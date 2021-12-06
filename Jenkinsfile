@Library(first') _

//import src.Helper
//def gv

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
pipeline {
    agent any
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

