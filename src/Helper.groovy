import groovy.transform.Field
Sting venvDir = "envs"
String p
String test
String str

def setParams() {
    p = "${params.PACKAGE}"
    test = "https://gitlab.redhat.com/cchetna/mock_rhel.git@master"
    str = String.join("/", "envs", "${test}".split("/")[-1].split(".git")[0])
}    

//String p = "${params.PACKAGE}"
    //def file = load 'vars/demo.sh' 

    def printString(String Name) {
      echo ("Create String '${Name}' ")
      echo ("Create String '${p}' ")
    }

    def createEnv() {
        echo ("Setting params----")
        setParams() 
       // p = getPackage()
       // String test = "https://gitlab.redhat.com/cchetna/mock_rhel.git@master"
       // String str = String.join("/", "envs", "${test}".split("/")[-1].split(".git")[0])
        echo ("Split str is '${str}' ")
        echo ("Create String '${p}' ")
    }

    def cpFile(String venv) {
        echo ("${venv}")
    }

    def getPackage() {
        return "${params.PACKAGE}"
    }
    
return this
//return new Helper()
