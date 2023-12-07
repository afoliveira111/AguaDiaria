package com.example.aguadiaria

import android.content.Context
import androidx.core.content.edit
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class GlassPreferences(private val context: Context) {

        companion object {
            const val PREFS_NAME = "com.example.aguadiaria.preferences"
            const val PREFS_PREFIX = "key "
        }

        private  val sdf = SimpleDateFormat("ddMMyyyy", Locale.US)

         fun save(value: Int) {
             context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).edit {
                 putInt(PREFS_PREFIX + sdf.format(Date()), value)

      }
   }
}