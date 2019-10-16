package com.example.presidentview_153

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val namapres = arrayOf<String>("Ir. Sukarno", "Suharto", "BJ. Habibie", "Gusdur","Megawati","Susilo Bambang Yudhoyono", "Joko Widodo")
    val deskripsipres = arrayOf<String>("1","2","3","4","5","6","7")
    val gambarpres = arrayOf<Int>(
        R.drawable.soekarno,
        R.drawable.suharto,
        R.drawable.habibi,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.susilo,
        R.drawable.jokowi
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ap = AdapterPress(this,namapres,deskripsipres,gambarpres)
        listpres.adapter = ap

        listpres.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "${namapres[position]} beliau jabatan ke  ${deskripsipres[position]}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
