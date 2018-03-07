package org.scalatest.junit.jupiter

import org.junit.jupiter.api.extension.Extension
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback
import org.junit.jupiter.api.extension.ExtensionContext

class JUnitExtension extends Extension with BeforeTestExecutionCallback {
  
  def beforeTestExecution( context: ExtensionContext ): Unit = {
    
  }

}