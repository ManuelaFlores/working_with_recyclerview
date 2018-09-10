package com.example.manuflowers.recyclerview_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         init()
    }

    fun init () {
        val list = mutableListOf(User("Usuario1",12,R.drawable.ic_user),User("Usuario 2", 12,R.drawable.ic_user))
        rvUserList.adapter = UserAdapter(list)
        fabAdd.setOnClickListener {
            Log.e("click","click")
            list.removeAt(list.size - 1)
            rvUserList.adapter.notifyDataSetChanged()
        }

    }
}
