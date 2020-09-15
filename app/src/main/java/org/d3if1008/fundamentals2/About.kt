package org.d3if1008.fundamentals2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity(), View.OnClickListener {
    var menu: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar!!.title = getString(R.string.about)

        menu = findViewById(R.id.menu)
        menu?.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.menu -> {
                val intentMenu = Intent(this, MainActivity::class.java)
                intentMenu.putExtra("KEY_TITLE", "Menu Utama")
                startActivity(intentMenu)
            }
        }
    }
}