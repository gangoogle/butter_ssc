package com.butter.butterssc.ui.activity

import android.content.Context
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.butter.butterssc.R
import com.butter.butterssc.adapter.RCLottertAdapter
import com.butter.butterssc.model.CaiPiaoUrl
import com.butter.butterssc.model.response.BaseResp
import com.butter.butterssc.model.response.CaiPiaoResponse
import com.butter.butterssc.net.Api
import com.butter.butterssc.net.RetrofitNetHelper
import com.butter.butterssc.ui.view.MyProgressDialog
import com.butter.butterssc.utils.ComUtils
import kotlinx.android.synthetic.main.activity_lottery_detail.*

class LotteryDetailActivity : AppCompatActivity() {
    lateinit var mContext: Context
    lateinit var dialog: MyProgressDialog
    lateinit var mCurrCaipiaoUrl: String
    lateinit var mCaipiaoUrlList: List<CaiPiaoUrl>
    val SIZE = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottery_detail)
        mContext = this
        dialog = MyProgressDialog(this)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ll_status_l.setBackgroundColor(this.resources.getColor(R.color.olivedrab))
            this.getWindow().setStatusBarColor(this.resources.getColor(R.color.olivedrab))
            tv_title_l.setTextColor(this.resources.getColor(R.color.white))
        }
        mCurrCaipiaoUrl = intent.getStringExtra("url")
        tv_title_l?.text = intent.getStringExtra("name")
        fab_l.setOnClickListener { finish() }
        reqquestLottery()
        ComUtils.addScore(this, 2)
    }


    private fun reqquestLottery() {
        dialog.initDialog("loading...")
        val callResponse = RetrofitNetHelper.getInstance(mContext)
                .getAPIService(Api::class.java)
                .requestUrl("${mCurrCaipiaoUrl}-$SIZE.json")
        RetrofitNetHelper.getInstance(mContext)
                .enqueueCall(callResponse, object : RetrofitNetHelper.RetrofitCallBack<CaiPiaoResponse> {
                    override fun onSuccess(baseResp: BaseResp<CaiPiaoResponse>) {
                        dialog.dissmisDialog()
                        rc_view_l.layoutManager = LinearLayoutManager(mContext)
                        rc_view_l.adapter = RCLottertAdapter(mContext, baseResp.data)
                    }

                    override fun onFailure(error: String) {
                        dialog.dissmisDialog()
                        rc_view_l.adapter = RCLottertAdapter(mContext, arrayListOf<CaiPiaoResponse>())
                        Toast.makeText(mContext, "数据拉取失败", Toast.LENGTH_SHORT).show()
                    }
                })
    }

}
