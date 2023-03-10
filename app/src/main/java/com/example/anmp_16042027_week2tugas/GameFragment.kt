package com.example.anmp_16042027_week2tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_game.*


class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments != null) {
            val answerFromMain = GameFragmentArgs.fromBundle(requireArguments()).guessAnswer

            var score = view.findViewById<TextView>(R.id.txtScore)
            score.text = "Your Score is $answerFromMain.toString()"

            btnReturn.setOnClickListener {
                val action = GameFragmentDirections.actionMainFragment()
                Navigation.findNavController(it).navigate(action)
            }

        }

    }
}