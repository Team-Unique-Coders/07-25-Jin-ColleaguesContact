//package com.example.colleaguescontact.data.model.people
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.Recycler
//import com.example.colleaguescontact.R
//import com.example.colleaguescontact.data.model.rooms.RoomsItemRoomsModel
//
//abstract class RoomsAdapter(private val roomsList: List<RoomsItemRoomsModel>) :
//    RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>(){
//    class RoomsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//        val name : TextView = itemView.findViewById(R.id.name)
//        val job : TextView = itemView.findViewById(R.id.job)
//
//
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomsViewHolder {
//        var view = LayoutInflater.from(parent.context).inflate((R.layout.item_people), parent, false)
//        return RoomsViewHolder(view)
//
//    }
//
//    override fun getItemCount(): Int =
//        roomsList.size
//
//
//
//    override fun onBindViewHolder(holder: RoomsViewHolder, position: Int) {
//        val person = roomsList[position]
//        holder.name.text = person.name
//        holder.job.text = person.jobtitle
//    }
//
//}