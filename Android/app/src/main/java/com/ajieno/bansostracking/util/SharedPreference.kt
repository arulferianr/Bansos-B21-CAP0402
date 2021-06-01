package com.ajieno.herbi.util

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by Kolincodes on 10/05/2018.
 */

class SharedPreference(val context: Context) {
    private val PREFS_NAME = "kotlincodes"
    val sharedPref: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)


    fun save(KEY_NAME: String, value: String) {
        val editor: SharedPreferences.Editor = sharedPref.edit()

        editor.putString(KEY_NAME, value)

        editor.commit()
    }

    fun getValueString(KEY_NAME: String): String? {

        return sharedPref.getString(KEY_NAME, null)
    }

    fun clearSharedPreference() {

        val editor: SharedPreferences.Editor = sharedPref.edit()

        //sharedPref = PreferenceManager.getDefaultSharedPreferences(context);

        editor.clear()
        editor.commit()
    }
}