package com.example.RHA

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_pts.R

class Adaptor(
    val listtokoh: Array<Data_tokoh>,
    val onclik : (
    namaTokoh : String,
    asalNegara : String,
    dexkripsiTokoh : String,
    gambarTokoh : Int,
    profesi: String
            )->Unit
) : RecyclerView.Adapter<Adaptor.tokoViewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tokoViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.simpenan, parent, false)
        return tokoViewholder(view)
    }

    override fun getItemCount(): Int {
        return listtokoh.size
    }

    override fun onBindViewHolder(holder: tokoViewholder, position: Int) {
        val Bindtokoh = listtokoh.get(position)
        holder.bind(Bindtokoh)
        holder.itemView.rootView.setOnClickListener{
            onclik(Bindtokoh.dexkripsiTokoh,Bindtokoh.asalNegara,Bindtokoh.namaTokoh,Bindtokoh.gambarTokoh, Bindtokoh.profesi)
        }
    }

    class tokoViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data_tokoh: Data_tokoh) {
            val gambar = itemView.findViewById<ImageView>(R.id.gambar)
            val nama = itemView.findViewById<TextView>(R.id.nama)
            val negara = itemView.findViewById<TextView>(R.id.negara)
            val profesi = itemView.findViewById<TextView>(R.id.profesi)

            gambar.setImageResource(data_tokoh.gambarTokoh)
            nama.text = data_tokoh.namaTokoh
            negara.text = data_tokoh.asalNegara
            profesi.text = data_tokoh.profesi

        }
    }

}