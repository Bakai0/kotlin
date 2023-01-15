package com.example.myapplication1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication1.fragments.TextFragment

class TextAdapter(private val listText: MutableList<TextModel>, private val onClick: TextFragment) :
    RecyclerView.Adapter<TextAdapter.TextViewHolder>() {

    inner class TextViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var textMain: TextView? = null

        init {
            textMain = view.findViewById(R.id.text_main)
        }

        fun onBind(textModel: TextModel) {
            textMain?.text = textModel.toString()

            itemView.setOnClickListener {
                onClick.OnClikItem(textModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        return TextViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_text, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.onBind(listText[position])
    }

    override fun getItemCount() = listText.size

}
