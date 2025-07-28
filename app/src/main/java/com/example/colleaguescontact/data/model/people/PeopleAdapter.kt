package com.example.colleaguescontact.data.model.people

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.colleaguescontact.R

class PeopleAdapter(private val peopleList: List<PeopleItemPeopleModel>) :
    RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>(){

    class PeopleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val name : TextView = itemView.findViewById(R.id.name)
        val job : TextView = itemView.findViewById(R.id.job)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate((R.layout.item_people), parent, false)
        return PeopleViewHolder(view)

    }

    override fun getItemCount(): Int =
        peopleList.size



    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        val person = peopleList[position]
        holder.name.text = person.name
        holder.job.text = person.jobtitle
    }

}