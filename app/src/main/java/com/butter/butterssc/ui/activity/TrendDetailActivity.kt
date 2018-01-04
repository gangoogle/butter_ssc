package com.butter.butterssc.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.butter.butterssc.R
import kotlinx.android.synthetic.main.activity_trend_detail.*

class TrendDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trend_detail)
        val bundle = intent.getBundleExtra("data")
        val title = bundle.getString("name")
        tv_title.text = title
        webview.loadHtml(bundle.getString("url"))
        fab.setOnClickListener { finish() }
    }
}
