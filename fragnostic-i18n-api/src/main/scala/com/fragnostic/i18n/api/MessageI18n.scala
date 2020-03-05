package com.fragnostic.i18n.api

import java.util.Locale

trait MessageI18n {

  def getString(locale: Locale, code: String): String

  def getFormattedString(locale: Locale, code: String, arguments: List[String]): String

}
