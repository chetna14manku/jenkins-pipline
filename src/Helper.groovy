import groovy.transform.Field

checkout scm
def file = load '../vars/demo.sh' 

def printString(String Name) {
      echo ("Create String '${Name}' ")
}

def createEnv() {
    String test = "https://gitlab.redhat.com/cchetna/mock_rhel.git@master"
    String str = String.join("/", "envs", "${test}".split("/")[-1].split(".git")[0])
    echo ("Split str is '${str}' ")
}

def cpFile() {
    sh ('''
    cp demo.sh demo.sh
    ''')
}

return this
