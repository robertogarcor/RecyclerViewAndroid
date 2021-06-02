package com.example.rgc.recyclerviewandroid.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rgc.recyclerviewandroid.R
import com.example.rgc.recyclerviewandroid.customView.AspectRatioImageView
import com.example.rgc.recyclerviewandroid.datasource.Movie
import com.example.rgc.recyclerviewandroid.ui.MovieDetailActivity

class MovieAdapter(private val context: Context, private val dataMovies : List<Movie>)
                    : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = dataMovies[position]
        holder.bind(context, movie)
    }

    override fun getItemCount() : Int {
        return dataMovies.size
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        private val title_movie : TextView = view.findViewById<TextView>(R.id.textView_title_movie)
        private val image_movie : AspectRatioImageView = view.findViewById<AspectRatioImageView>(R.id.imageView_movie)

        fun bind(context: Context, movie: Movie) {
            title_movie.text = movie.title
            image_movie.ratio = 1.5f
            Glide.with(context).load(movie.enclosure).into(image_movie);
            // Listener item click
            itemView.setOnClickListener(View.OnClickListener {
                //Show detail item movie
                val intent = Intent(context, MovieDetailActivity::class.java).apply {
                    putExtra("MOVIE", movie)
                }
                context.startActivity(intent)
            })
        }
    }

}