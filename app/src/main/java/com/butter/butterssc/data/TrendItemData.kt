package com.butter.butterssc.data

import com.butter.butterssc.R
import com.butter.butterssc.model.TrendItem

/**
 * Created by zgyi on 2018-01-03.
 */
fun getTrendItemData(): List<TrendItem> {
    return listOf(
            TrendItem(R.mipmap.ic_shuangseqiu, "双色球走势图", "shuangseqiu.html"),
            TrendItem(R.mipmap.ic_daletou,"大乐透走势图","大乐透走势图,超级大乐透前后区冷热基本走势图-网易彩票.html")

    )
}