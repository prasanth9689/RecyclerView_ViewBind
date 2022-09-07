package com.skyblue.recyclerviewviewbind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.skyblue.recyclerviewviewbind.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.steve_job, "Steve Jobs \n Apple", "68" ))
            data.add(ItemsViewModel(R.drawable.bill_gates, "Bill Gates \n Microsoft ", "42"))
        }

        val adapter = BooksAdapter(data)

        binding.recyclerView.adapter = adapter
    }

    fun onClickMenu2(view: View) {}
    data class ItemsViewModel(val image: Int, val text: String , val percentage: String) {
    }

}