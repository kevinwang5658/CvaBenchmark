package com.kevin.wang.cva.benchmark

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.view.LayoutInflaterCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rievo.unison.benchmark.R

class MainActivity : AppCompatActivity() {

    private lateinit var recycler: RecyclerView
    private var inflater: LayoutInflater? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inflater = LayoutInflater.from(this).cloneInContext(this)
        LayoutInflaterCompat.setFactory2(inflater!!, CustomInflaterFactory()) //comment this out get benchmark for without the library

        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.recycler_view)
        recycler.adapter = Adapter()
        recycler.layoutManager = LinearLayoutManager(this)
    }

    override fun getLayoutInflater(): LayoutInflater {
        return inflater!!
    }

    override fun getSystemService(name: String?): Any {
        if (name == Context.LAYOUT_INFLATER_SERVICE) {
            if (inflater != null) {
                return inflater!!
            } else {
                return super.getSystemService(name)
            }
        }
        return super.getSystemService(name)
    }
}
