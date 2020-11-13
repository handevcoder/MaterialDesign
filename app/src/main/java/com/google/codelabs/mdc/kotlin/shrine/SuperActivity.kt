package com.google.codelabs.mdc.kotlin.shrine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SuperActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_super)

    }

    fun next(view: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finishAfterTransition()
    }

    fun exit(view: View) {
        finish()
    }
}