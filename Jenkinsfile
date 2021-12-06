//import src.Helper
def gv

properties([
    parameters([
          string(
	       defaultValue: 'python', 
	       description: 'Package you want to install', 
	       name: 'PACKAGE'
	  )
    ])
])

def call(Map config) {
    node {
          stage("Test") {
	      // Test
              //def helper = new src.Helper()
	      //helper.printString('${params.PACKAGE}')
	      script {
	               gv = load "Helper.groovy"
		       gv.printString('${params.PACKAGE}')
		  }
	  }
	   stage("Build") {
              // Build
          }
	   stage("Deploy") {
              // Deploy
          }
    }
}
