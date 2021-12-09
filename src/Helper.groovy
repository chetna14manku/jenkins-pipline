import groovy.transform.Field

class Helper {
    
    String p = "${params.PACKAGE}"

def printString(String Name) {
      echo ("Create String '${Name}' ")
      echo ("Create String '${p}' ")
}

def createEnv() {
    String test = "https://gitlab.redhat.com/cchetna/mock_rhel.git@master"
    String str = String.join("/", "envs", "${test}".split("/")[-1].split(".git")[0])
    echo ("Split str is '${str}' ")
    echo ("Create String '${p}' ")

}

def cpFile() {
    sh ('''
    cp demo.sh demo.sh
    ''')
}
}

return new Helper()
