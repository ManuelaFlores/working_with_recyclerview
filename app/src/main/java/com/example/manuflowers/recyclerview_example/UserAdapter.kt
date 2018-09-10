package com.example.manuflowers.recyclerview_example

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.user_item.view.*

class UserAdapter(private val userList :List<User>) : RecyclerView.Adapter<UserAdapter.UserAdapterViewHolder>() {

    override fun getItemCount(): Int  = userList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapterViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent,false)
        return UserAdapterViewHolder(v)
    }

    override fun onBindViewHolder(holder: UserAdapterViewHolder, position: Int) {
       val user = userList[position]
        holder.itemView.tvName.text = user.name
    }

    /**
     * This method recieves as paramethers : a ViewGroup and an integer
     * this method only works when you need to show a new item
     */
    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapterViewHolder {
        //¿where should I use the viewType value?
        val v = LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
        return UserAdapterViewHolder(v)
    }

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: UserAdapterViewHolder, position: Int) {
     // getting the first position : listUsers[0]
        val user = userList[position]
        holder.itemView.tvName.text = user.name
    }*/

    class UserAdapterViewHolder (view : View) : RecyclerView.ViewHolder(view)
}