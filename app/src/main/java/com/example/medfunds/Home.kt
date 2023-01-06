package com.example.medfunds

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    private lateinit var webView: WebView
    private val URL = "https://google.com"

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        webView = findViewById(R.id.webView)

        webView.apply {
            loadUrl(URL)
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }

    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack()
        }else {
            super.onBackPressed()
        }
    }
}