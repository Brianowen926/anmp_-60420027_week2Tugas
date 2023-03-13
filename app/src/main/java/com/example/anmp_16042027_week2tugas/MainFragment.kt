package com.example.anmp_16042027_week2tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import org.w3c.dom.Text
import kotlin.random.Random


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var random = (1..10).random()
        txtNum1.text = random.toString()
        txtNum2.text = random.toString()
        var answer = txtNum1.text.toString().toInt() + txtNum2.text.toString().toInt()

        btnSubmit.setOnClickListener {
            val guestAnswer = txtAnswer.text.toString().toInt()
            if(guestAnswer != answer){
                val action = MainFragmentDirections.actionGameFragment(guestAnswer.toString())
                Navigation.findNavController(it).navigate(action)
            }

        }
    }

}