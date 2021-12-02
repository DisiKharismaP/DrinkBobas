package disiiy.khaper.drinkbobas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import disiiy.khaper.drinkbobas.databinding.ItemListBinding
import disiiy.khaper.drinkbobas.model.Bobas

class BobasAdapter(val listDataBobas: ArrayList<Bobas>): RecyclerView.Adapter<BobasAdapter.ViewHolder>(){

    inner class ViewHolder (var bobasBinding : ItemListBinding) : RecyclerView.ViewHolder(bobasBinding.root)
    private lateinit var onItemClickCallback: OnItemClickCallBack

    interface OnItemClickCallBack {
        fun onItemClicked(bobas: Bobas)
    }

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallBack) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bobasBinding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(bobasBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val bobas = listDataBobas[position]

        Glide.with(holder.itemView.context).load(bobas.imagePhoto).into(holder.bobasBinding.ivPhoto)
        holder.bobasBinding.tvName.text = bobas.name
        holder.bobasBinding.tvDesc.text = bobas.description
        holder.bobasBinding.tvPrice.text = bobas.price

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listDataBobas[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listDataBobas.size

}