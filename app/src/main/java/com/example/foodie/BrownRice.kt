package com.example.foodie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.foodie.adapter.ItemAdapter
import com.example.foodie.data.DataSource
import com.example.foodie.model.details

class BrownRice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brown_rice)

        val dataset = DataSource().loaddetails()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val itemAdapter = ItemAdapter(this,dataset)
        recyclerView.adapter = itemAdapter
        val clickListener:ItemAdapter.ClickListener=object:ItemAdapter.ClickListener{
            override fun onItemClick(view: View, position:Int) {
                val dish=itemAdapter.getdish(position)
                launchDetailActivity(dish)
            }
        }
        recyclerView.setHasFixedSize(true)
        itemAdapter.setItemClickListener(clickListener)


    }
    private fun launchDetailActivity(Details: details){
        val intent= Intent(this,detailsActivity::class.java)
        intent.putExtra("ingredients",details.ingredients)
        intent.putExtra("description",details.description)
        intent.putExtra("image",details.image)
        startActivity(intent)
    }
}