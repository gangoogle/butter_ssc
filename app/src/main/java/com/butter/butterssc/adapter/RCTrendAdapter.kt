package com.butter.butterssc.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.butter.butterssc.R
import com.butter.butterssc.model.TrendItem
import kotlinx.android.synthetic.main.item_trend.view.*

/**
 * Created by zgyi on 2018-01-03.
 */
class RCTrendAdapter(val context: Context, val items: List<TrendItem>) : RecyclerView.Adapter<RCTrendAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.itemView?.imageview?.setImageResource(items[position]?.imgId)
        holder?.itemView?.tv_name?.text = items[position]?.name
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return (ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_trend, parent, false)))
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}