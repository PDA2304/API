package com.example.newsapi

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var item = intent.getParcelableExtra<ItemOfList>("OBJECK")
        Picasso.with(this).load(item?.image).into(imageView)

        Title.text = item?.title
        description.text = item?.description
        Name.text = item?.name

//            var handler = Handler()
//            handler.postDelayed(object : Runnable {
//                override fun run() {
//
//                }
//            }, 1000)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                if (imageView.getDrawable() == null) {
                    progressBar.visibility = View.VISIBLE
                } else {
                    runOnUiThread()
                    {
                        progressBar.visibility = View.INVISIBLE
                    }
                }
            }
        }, 1000)

    }

}
