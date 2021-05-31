package com.example.rgc.recyclerviewandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rgc.recyclerviewandroid.datasource.Movie
import com.example.rgc.recyclerviewandroid.repository.MovieRepository
import com.example.rgc.recyclerviewandroid.repository.MovieRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {

    private val repository : MovieRepository = MovieRepositoryImpl()

    private val _movies  =  MutableLiveData<List<Movie>>()
    val movies : LiveData<List<Movie>> get() = _movies

    init {
        viewModelScope.launch {
            _movies.postValue(withContext(Dispatchers.IO) {
                Thread.sleep(2000)
                repository.getMovies()
            }!!)
        }
    }







}