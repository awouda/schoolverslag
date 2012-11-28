package example

import org.scalatest.FunSuite
import com.jtm.schoolverslag.model.Gebruiker

class IntegrationWithModel extends FunSuite {


  test("first service test, calling class from domain") {
     
    assert( Gebruiker().toString!= null)

  }
 

}

