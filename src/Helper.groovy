import groovy.transform.Field


def printString(String Name) {
      echo ("Create String '${Name}' ")
}

def createEnv(String venvName, String pythonv="/usr/bin/python3.6", Boolean sitePackages=false, Boolean upgrade=true) {
      sh("""
      virtualenv --python ${pythonv} \
      ${sitePackages ? "--system-site-packages" : ""} \
      ${venvName}
      ${(upgrade) ? "${venvName}/bin/pip install --upgrade pip" : ""}
      ${venvName}/bin/pip install "setuptools<58,>55"
       """ )
}

return this
