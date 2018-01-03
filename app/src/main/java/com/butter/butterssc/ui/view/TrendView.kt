package com.butter.butterssc.ui.view

import android.content.Context
import android.view.View
import android.widget.TextView
import com.butter.butterssc.R

/**
 * Created by zgyi on 2018-01-03.
 */
class TrendView(context: Context) : BaseHomeView(context) {

    var mView: View? = null


    override fun getView(): View {
        if (mView == null) {
            mView = View.inflate(context, R.layout.view_trend, null)
        }
        return mView ?: View(context)
    }

     override fun initData() {

    }
}