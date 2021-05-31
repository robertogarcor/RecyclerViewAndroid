package com.example.rgc.recyclerviewandroid.repository

import com.example.rgc.recyclerviewandroid.datasource.Movie

interface MovieRepository {

    fun getMovies() : List<Movie>

}