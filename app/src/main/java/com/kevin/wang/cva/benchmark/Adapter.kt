package com.kevin.wang.cva.benchmark

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rievo.unison.benchmark.R

class Adapter : RecyclerView.Adapter<ViewHolder>() {

    companion object {
        const val NUM_ITEMS = 100
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val start = System.nanoTime();
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_custom, parent, false)
        val holder = ViewHolder(view)
        LoggingManager.add((System.nanoTime() - start).toDouble() / 1000000)

        return holder
    }

    override fun getItemCount(): Int {
        return NUM_ITEMS
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView1.setText("sdjajkdh")
        holder.textView2.setText("sdjfhsjkfhs")
        holder.image.setImageResource(R.mipmap.ic_launcher)
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView1: TextView = itemView.findViewById(R.id.text1)
    val textView2: TextView = itemView.findViewById(R.id.text2)
    val image: ImageView = itemView.findViewById(R.id.image)
}
