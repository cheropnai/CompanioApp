package com.example.companioapp

import android.content.Intent

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ImageSpan
import androidx.core.util.Pair

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.google.android.material.textfield.TextInputLayout
class loginActivity : AppCompatActivity() {

    private lateinit var callSignUp: Button
    private lateinit var logoText: TextView
    private lateinit var username: TextInputLayout
    private lateinit var password: TextInputLayout
    private lateinit var loginBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        callSignUp = findViewById(R.id.newUserSignUp)
        logoText = findViewById(R.id.logintextView2)
        username = findViewById(R.id.email)
        password = findViewById(R.id.password)
        loginBtn = findViewById(R.id.login_btn)

        callSignUp.setOnClickListener {
            val intent = Intent(this@loginActivity, Registration::class.java)
            val pairs: Array<Pair<View, String>> = arrayOf(
                Pair.create(logoText, "logo_text"),
                Pair.create(username, "username_tran")
                
            )

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this@loginActivity, *pairs)
            startActivity(intent, options.toBundle())
        }
    }
}