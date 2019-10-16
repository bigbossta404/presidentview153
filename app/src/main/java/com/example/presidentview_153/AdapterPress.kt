package com.example.presidentview_153

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterPress(
    private val context: Activity,
    private val namaatas: Array<String>,
    private val dekripsipres: Array<String>,
    private val gambarpres: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.layoutdua, namaatas) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.layoutdua, null, true)
        val titleText = rowView.findViewById(R.id.namautama) as TextView
        val imageView = rowView.findViewById(R.id.gambarpres) as ImageView

        titleText.text = namaatas[position]
        imageView.setImageResource(gambarpres[position])

        return rowView
    }
}