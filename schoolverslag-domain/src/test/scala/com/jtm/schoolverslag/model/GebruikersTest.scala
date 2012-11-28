package com.jtm.schoolverslag.model

import org.scalatest.{BeforeAndAfter, FunSuite}
import com.jtm.schoolverslag.schema.SchoolverslagSchema._
import com.jtm.schoolverslag.db.SchoolverslagDB
import org.squeryl.PrimitiveTypeMode._

class GebruikersTest extends FunSuite with BeforeAndAfter {

  SchoolverslagDB.initSquerylDB()

  test("insert gebruikers") {
    inTransaction {
      drop
      create
      gebruikers.insert(TestData.gebruikersLijst)

      assert(alleGebruikers.size == 100)
    }
  }
}
