package com.butter.butterssc.ui.view

import android.content.Context
import android.view.View
import android.widget.TextView
import com.butter.butterssc.R

/**
 * Created by zgyi on 2018-01-03.
 */
class NewsView(context: Context) : BaseHomeView(context) {

    var mView: View? = null

    override fun getView(): View {
        if (mView == null) {
            mView = View.inflate(context, R.layout.view_news, null)
        }
        return mView?:View(context)
    }


    override fun initData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}