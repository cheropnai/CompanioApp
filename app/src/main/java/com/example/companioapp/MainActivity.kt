package com.example.companioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.util.Pair

import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat

class MainActivity : AppCompatActivity() {
    //variables
    private val SPLASH_SCREEN: Long = 5000;
    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation
    private lateinit var image: ImageView
    private lateinit var logo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        topAnim = AnimationUtils.loadAnimation(this
                ,R.anim.top_animations);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks
        image = findViewById(R.id.imageView2)
        logo = findViewById(R.id.textView2)

        image.animation = topAnim
        logo.animation = bottomAnim

        Handler().postDelayed({
            val intent = Intent(this@MainActivity, loginActivity::class.java)
            val pairs: Array<Pair<View, String>> = arrayOf(
                Pair.create(image, "logo_image"),
                Pair.create(logo, "logo_text")
            )

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this@MainActivity, *pairs)
            startActivity(intent, options.toBundle())

        }, SPLASH_SCREEN);


    }
}