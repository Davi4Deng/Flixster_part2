package com.example.flixsterforthebestmovie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flixsterforthebestmovie.R.id

class MovieAdapter(private val movieList: List<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {


    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mItem: Movie? = null
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val nameTextView: TextView = itemView.findViewById(R.id.textView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.textView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_best_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        val fullUrl = "https://image.tmdb.org/t/p/w500/" + movie.movieImageUrl
        holder.mItem = movie
        holder.nameTextView.text = movie.title.toString()
        holder.descriptionTextView.text = movie.description.toString()

        Glide.with(holder.itemView)
            .load(fullUrl)
            .centerInside()
            .into(holder.imageView)
    }


    override fun getItemCount() = movieList.size
}
