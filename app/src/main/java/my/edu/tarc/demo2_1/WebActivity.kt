package my.edu.tarc.demo2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val myWebView: WebView = findViewById(R.id.webView
        )
        myWebView.loadUrl("https://www.google.com.my")
    }
}
