package com.example.colleaguescontact

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.colleaguescontact.data.model.people.PeopleAdapter
import com.example.colleaguescontact.data.model.people.PeopleViewModel


class PeopleFragment : Fragment() {
    private lateinit var peopleViewModel: PeopleViewModel
    private lateinit var peopleAdapter: PeopleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_people, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        peopleViewModel = ViewModelProvider(this)[PeopleViewModel::class.java]
        peopleAdapter = PeopleAdapter(emptyList())

        val recyclerView = view.findViewById<RecyclerView>(R.id.peopleRecycleView)
        recyclerView.adapter = peopleAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Observe data and update UI
        peopleViewModel.people.observe(viewLifecycleOwner) { peopleList ->
            peopleAdapter = PeopleAdapter(peopleList)
            recyclerView.adapter = peopleAdapter
        }

        // Fetch data
        peopleViewModel.fetchPeople()
    }

}