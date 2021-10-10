package com.example.post_request

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.names_item_row.view.*

class NamesGridView(val list: List<List<String>>, val t: Context): BaseAdapter() {
    override fun getCount(): Int = list.size

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var inflater = t!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var appView = inflater.inflate(R.layout.names_item_row, null)

        val person = list[p0]

        appView.user_name.text = if(person[0].length < 20)
            person[0]
        else
            person[0].substring(0, 20) + "...."
        appView.user_location.text = person[1]


        return appView
    }
}