package com.insiro.lifepet.achievement

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.insiro.lifepet.R
import com.insiro.lifepet.entity.Achievement

class ListAdapter(val context: Context, val achieveList: ArrayList<Achievement>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_achieve, null)
        val name: TextView = view.findViewById(R.id.item_achieve_name)
        val percent: TextView = view.findViewById(R.id.item_achieve_percent)

        val achieve = achieveList[position]

        name.text = achieve.category.name
        percent.text = String.format("%d", achieve.achieved_time / achieve.target * 100)

        return view
    }


    override fun getItem(position: Int): Any {
        return achieveList[position]
    }


    override fun getItemId(position: Int): Long {
        return 0
    }


    override fun getCount(): Int {
        return achieveList.size
    }
}