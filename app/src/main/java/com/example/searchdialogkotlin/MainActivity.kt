package com.example.searchdialogkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ir.mirrajabi.searchdialog.SimpleSearchDialogCompat
import ir.mirrajabi.searchdialog.adapters.SearchDialogAdapter
import ir.mirrajabi.searchdialog.core.SearchResultListener
import ir.mirrajabi.searchdialog.core.Searchable
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSearch.setOnClickListener {
            SimpleSearchDialogCompat(this@MainActivity , "Search" , "what are you looking for ", null ,initData()
            , SearchResultListener { baseSearchDialogCompat, item, position ->
                    Toast.makeText(this@MainActivity , item.title , Toast.LENGTH_SHORT).show()
                    baseSearchDialogCompat.dismiss()

                })
        }
    }

    //This is a function that takes in the title and makes it null safe
    private fun initData(): ArrayList<searchModel> {
        val items = ArrayList<searchModel>()
        items.add(searchModel("Man"))
        items.add(searchModel("Woman"))
        items.add(searchModel("Goat"))
        items.add(searchModel("Kal"))
        items.add(searchModel("Kole"))
        items.add(searchModel("Scale"))
        items.add(searchModel("Hout"))
        items.add(searchModel("Zemm"))
        items.add(searchModel("Genenr"))

        return items
    }
}
