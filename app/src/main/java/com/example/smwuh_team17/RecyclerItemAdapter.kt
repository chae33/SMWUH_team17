package com.example.smwuh_team17

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerItemAdapter(private val context: Context) :
    RecyclerView.Adapter<RecyclerItemAdapter.ViewHolder>() {

    var datas = mutableListOf<UserData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.buy_item_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: RecyclerItemAdapter.ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val productName: TextView = itemView.findViewById(R.id.product_name)
        private val productDetail: TextView = itemView.findViewById(R.id.product_detail)
        private val imgProfile: ImageView = itemView.findViewById(R.id.product_img)

        fun bind(item: UserData) {
            productName.text = item.name
            productDetail.text = item.detail
            Glide.with(itemView).load(item.img).into(imgProfile)

        }
    }


}