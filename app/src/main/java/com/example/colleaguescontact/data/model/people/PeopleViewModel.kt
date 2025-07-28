package com.example.colleaguescontact.data.model.people

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.colleaguescontact.repository.Repository
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class PeopleViewModel : ViewModel() {
    private val repository = Repository()
    private val _people = MutableLiveData<List<PeopleItemPeopleModel>>()
    val people: LiveData<List<PeopleItemPeopleModel>> = _people

    fun fetchPeople() {
        viewModelScope.launch {
            try {
                val response = repository.getPeople()
                _people.postValue(response)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}