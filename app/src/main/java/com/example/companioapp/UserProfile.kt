package com.example.companioapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.google.android.material.textfield.TextInputLayout

class UserProfile : AppCompatActivity() {

    private lateinit var callSignUp: Button
    private lateinit var logoText: TextView
    private lateinit var username: TextInputLayout
    private lateinit var password: TextInputLayout
    private lateinit var loginBtn: Button
    private lateinit var forgotPassword: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        callSignUp = findViewById(R.id.newUserSignUp)
        logoText = findViewById(R.id.logintextView2)
        username = findViewById(R.id.email)
        password = findViewById(R.id.password)
        loginBtn = findViewById(R.id.login_btn)
        forgotPassword = findViewById(R.id.forgot_password)

        callSignUp.setOnClickListener{
            val intent = Intent(this@UserProfile, Registration::class.java)
            val pairs: Array<Pair<View, String>> = arrayOf(
                Pair.create(logoText, "logo_text"),
//                Pair.create(username, "username_tran"),
//                Pair.create(password, "password_tran"),
//                //Pair.create(forgotPassword, "forgot_password_tran"), // Assuming this is the correct ID for the forgot password view
//                Pair.create(loginBtn, "login_btn_tran"),
//                Pair.create(callSignUp, "call_signup_tran")
            )

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this@UserProfile, *pairs)
            startActivity(intent, options.toBundle())
        }
        }
    }

