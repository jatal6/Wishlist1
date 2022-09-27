package com.example.wishlist
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.wish_item,parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.i(TAG, "onBindViewHolder position $position")
        val movie = movies[position]
        holder.bind(movie)
    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var Itemname: TextView
        var itemprice: TextView
        var itemlink: TextView

        init {
            Itemname = itemView.findViewById(R.id.item)
            itemprice = itemView.findViewById(R.id.url)
            itemlink = itemView.findViewById(R.id.price)

        }

        fun bind(info: Info){
            Itemname.text = info.inputText
            itemprice.text = info.inputText3
            itemlink.text = info.inputText2
    }

}
}