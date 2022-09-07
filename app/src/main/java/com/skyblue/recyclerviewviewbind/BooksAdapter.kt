package com.skyblue.recyclerviewviewbind

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.skyblue.recyclerviewviewbind.databinding.RowModelBookListBinding

class BooksAdapter(private val paymentList: List<MainActivity.ItemsViewModel>) : RecyclerView.Adapter<BooksAdapter.PaymentHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentHolder {
        val itemBinding = RowModelBookListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PaymentHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: PaymentHolder, position: Int) {
        val paymentBean: MainActivity.ItemsViewModel = paymentList[position]
        holder.bind(paymentBean)
    }

    override fun getItemCount(): Int = paymentList.size

    class PaymentHolder(private val itemBinding: RowModelBookListBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(ItemsViewModel: MainActivity.ItemsViewModel) {
            itemBinding.image1.setImageResource(ItemsViewModel.image)
            itemBinding.textName.setText(ItemsViewModel.text)
        }
    }
}