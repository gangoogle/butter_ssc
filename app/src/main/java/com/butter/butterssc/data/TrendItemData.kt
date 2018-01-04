package com.butter.butterssc.data

import com.butter.butterssc.R
import com.butter.butterssc.model.TrendItem

/**
 * Created by zgyi on 2018-01-03.
 */
fun getTrendItemData(): List<TrendItem> {
    return listOf(
            TrendItem(R.mipmap.ic_shuangseqiu, "双色球走势图", "shuangseqiu.html"),
            TrendItem(R.mipmap.ic_daletou, "大乐透走势图", "daletou.html"),
            TrendItem(R.mipmap.ic_chongqingssc, "重庆时时彩走势图", "chongqingshishicai.html"),
            TrendItem(R.mipmap.ic_3d, "福彩3d走势图", "3dzoushi.html"),
            TrendItem(R.mipmap.ic_11xuan5, "11选5走势图", "11xuan5.html"),
            TrendItem(R.mipmap.ic_7xingcai, "7星彩走势图", "7xingcai.html"),
            TrendItem(R.mipmap.ic_kuai3, "快3走势图", "kuai3.html"),
            TrendItem(R.mipmap.ic_7lecai, "七乐彩走势图", "7乐彩.html"),
            TrendItem(R.mipmap.ic_pailie3, "排列3走势图", "pailie3.html"),
            TrendItem(R.mipmap.ic_pailie5, "排列5走势图", "pailie5.html")
    )
}