import src.Helper

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
              def helper = new Helper()
	      helper.printString('${params.PACKAGE}')
	  }
	   stage("Build") {
              // Build
          }
	   stage("Deploy") {
              // Deploy
          }
    }
}

