package com.jtm.schoolverslag

import db.SchoolverslagDB
import model.{TestData, Gebruiker}
import org.squeryl.PrimitiveTypeMode._
import schema.SchoolverslagSchema._

object Runner extends App {

  SchoolverslagDB.initSquerylDB()

}
