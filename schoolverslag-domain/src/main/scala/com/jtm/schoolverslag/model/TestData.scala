package com.jtm.schoolverslag.model

object TestData {

  def gebruikersLijst = {
    1 to 100 map {
      getal =>
        Gebruiker("swwsw", "dede", "ded", None, "dwdwwdw" + getal)
    } toList
  }


}
