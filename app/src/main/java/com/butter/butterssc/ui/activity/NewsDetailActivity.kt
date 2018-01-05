package com.butter.butterssc.ui.activity

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import com.butter.butterssc.R
import com.butter.butterssc.data.getHomeTitleData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_trend_detail.*

class NewsDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trend_detail)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ll_status_t.setBackgroundColor(this.resources.getColor(R.color.cadetblue))
            this.getWindow().setStatusBarColor(this.resources.getColor(R.color.cadetblue))
            tv_title_t.setTextColor(this.resources.getColor(R.color.white))
            ll_status_t.setPadding(20,10,20,10)
        }
        val strContent = intent.getStringExtra("content")
        val title = intent.getStringExtra("title")
        tv_title_t.text = title
        tv_title_t.gravity=Gravity.CENTER_VERTICAL
        tv_title_t.setTextSize(14f)
        webview.loadData(strContent)
        fab.setOnClickListener { finish() }
    }

    private fun getHtmlData(bodyHTML: String): String {
        val head = "<head>" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> " +
                "<style>img{max-width: 100%; width:auto; height:auto;}</style>" +
                "</head>"
        return "<html>$head<body>$bodyHTML</body></html>"
    }
}
