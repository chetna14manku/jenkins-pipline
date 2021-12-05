package src

import groovy.transform.Field

@Field Log log = new Log(this)

def printString(String Name, String whichPython=Constants.defaultPython) {
      log.info("Create String '${Name}' and Python is '${whichPython}' ")
}
