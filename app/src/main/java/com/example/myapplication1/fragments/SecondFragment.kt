package com.example.myapplication1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.myapplication1.R


class SecondFragment : Fragment() {

    //    lateinit var rvNames: RecyclerView
    lateinit var edText: EditText
    lateinit var btn: Button
//    private val list = ArrayList<TextModel>()
//    private var adapter = TextAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn = view.findViewById(R.id.btn_to_textfragment)
        edText = view.findViewById(R.id.search_edit_frame)
        click()
    }

    private fun click() {
        btn.setOnClickListener(View.OnClickListener {
//            val bundle = Bundle()
//            val name = edText.text
//            val hello = "Привет, $name"
//            bundle.putString("Arg", hello)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view,  TextFragment())
                .addToBackStack("SecondFragment")
                .commit()
        })
    }
}