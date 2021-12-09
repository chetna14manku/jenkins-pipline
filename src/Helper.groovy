import groovy.transform.Field

<<<<<<< HEAD
class Helper {
    
    String p = "${params.PACKAGE}"
=======
//def file = load 'vars/demo.sh' 
>>>>>>> 31e5afd351ef2b53b2babecddbbad3310c9205ab

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
    echo ("try Copy")
    sh ('''
    cp vars/demo.sh demo.sh
    ''')
    echo ("cpy done")
}
}

return new Helper()
