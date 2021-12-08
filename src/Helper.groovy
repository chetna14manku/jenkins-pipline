import groovy.transform.Field


def printString(String Name) {
      echo ("Create String '${Name}' ")
}

def createEnv() {
    String test = "https://gitlab.redhat.com/cchetna/mock_rhel.git@master"
    String str = String.join("envs", "${test}".split("/")[-1].split("git")[0])
    echo ("Split str is '${str}' ")
}

return this
