package com.example.midmorningintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.webkit.WebView

class WebsitesActivity : AppCompatActivity() {
    lateinit var myweb: WebView
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_websites)
        myweb = findViewById(R.id.mweb)
        val webSettings = myweb.settings
        webSettings.javaScriptEnabled = true
        myweb.loadUrl("http://www,emobilis.ac.ke")
    }
}