package com.example.recicleviewexample.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recicleviewexample.R
import com.example.recicleviewexample.SuperHero

class SuperHeroAdapter(private val superHeroLis:List<SuperHero>) : RecyclerView.Adapter<SuperHeroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent,false))
    }

    override fun getItemCount(): Int {
        return superHeroLis.size
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item=superHeroLis[position]
        holder.render(item)
    }
}