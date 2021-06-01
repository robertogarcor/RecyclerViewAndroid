package com.example.rgc.recyclerviewandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.rgc.recyclerviewandroid.R
import com.example.rgc.recyclerviewandroid.adapter.MovieAdapter
import com.example.rgc.recyclerviewandroid.databinding.ActivityMainBinding
import com.example.rgc.recyclerviewandroid.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding : ActivityMainBinding
    private lateinit var linearManager: GridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setTitle(R.string.app_main_name)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Layout Design: LinearLayoutManager | GridLayoutManager | StaggeredGridLayoutManager
        linearManager = GridLayoutManager(this, 3)
        binding.recyclerviewMovie.layoutManager = linearManager

        viewModel.movies.observe(this, Observer { movies ->
            // Map recycleView and adapter MovieAdapter
            binding.recyclerviewMovie.adapter = MovieAdapter(movies)
        })
    }
}