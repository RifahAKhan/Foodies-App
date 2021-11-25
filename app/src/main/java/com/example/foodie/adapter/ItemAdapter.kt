package com.example.foodie.adapter

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodie.R
import com.example.foodie.model.details

class ItemAdapter(
    private val context: Context,
    private val dataset: List<details>
        ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private lateinit var clickListener: ClickListener
    class ItemViewHolder (private val view: View):RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.tvText)
        val imageView: ImageView = view.findViewById(R.id.ivImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_rice,parent,false)
        return ItemViewHolder(adapterView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val view = dataset[position]
        holder.textView.text = context.resources.getString(view.stringResourceId)
        holder.imageView.setImageResource(view.drawableResourceId)
        holder.itemView.setOnClickListener {
            clickListener.onItemClick(it, position)
        }
    }

    override fun getItemCount() = dataset.size

    fun setItemClickListener(mClickListener: ClickListener){
        clickListener = mClickListener
    }

    interface ClickListener{
        fun onItemClick(view:View, position: Int)
    }

    fun getdish(position:Int): details{
        return dataset[position]
    }


}