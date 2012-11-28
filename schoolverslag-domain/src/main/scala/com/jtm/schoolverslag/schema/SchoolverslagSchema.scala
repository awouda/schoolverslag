package com.jtm.schoolverslag.schema

import org.squeryl.Schema
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.KeyedEntity
import java.util.Date
import org.squeryl.Query
import org.squeryl.Query
import org.squeryl.dsl.GroupWithMeasures
import com.jtm.schoolverslag.model.Gebruiker

//import org.joda.time.Interval

trait SchoolverslagEntiteit extends KeyedEntity[Long] {
  val id: Long = 100l

}



object SchoolverslagSchema extends Schema {

  val gebruikers = table[Gebruiker]



  def alleGebruikers = from(gebruikers)(g => select(g))


}
