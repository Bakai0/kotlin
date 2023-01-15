package com.example.myapplication1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication1.R
import com.example.myapplication1.TextAdapter
import com.example.myapplication1.TextModel
import com.example.myapplication1.repozitory.TextRepozitory


class TextFragment : Fragment() {

    private lateinit var rvText: RecyclerView
    private val textList = ArrayList<TextModel>()
    private val adapter = TextAdapter(textList, this)
    private val repo = TextRepozitory()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_text, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvText = view.findViewById(R.id.rv_names)
        val bundle = Bundle()


        initialize()
    }

    private fun initialize() {
        rvText.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfText())
        rvText.adapter = adapter
    }

    fun OnClikItem(model: TextModel) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, SecondFragment())
            .addToBackStack(TextFragment::class.java.name)
            .commit()

    }
}
