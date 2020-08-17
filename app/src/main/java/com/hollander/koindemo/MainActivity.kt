package com.hollander.koindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hollander.koindemo.ui.school.SchoolFragment
import com.hollander.koindemo.ui.withParameters.SchoolWithParametersFragment
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            val fragment: SchoolFragment = get()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commitNow()
        }
    }

    fun openAnotherFragment() {
        val fragment: SchoolWithParametersFragment = get()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}