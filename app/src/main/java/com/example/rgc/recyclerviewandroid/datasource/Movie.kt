package com.example.rgc.recyclerviewandroid.datasource

import java.io.Serializable

data class Movie(val title:String,
                 val type:String,
                 val duration: String,
                 val description: String,
                 val enclosure: String) : Serializable
