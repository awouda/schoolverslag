package com.jtm.schoolverslag.model

import com.jtm.schoolverslag.schema.SchoolverslagEntiteit


case class Gebruiker(
                      val username: String,
                      val password: String,
                      val voornaam: String,
                      val tussenvoegsel: Option[String],
                      val achternaam: String
                      ) extends SchoolverslagEntiteit


object Gebruiker {

  def apply(): Gebruiker = Gebruiker("", "", "", None, "")

}
