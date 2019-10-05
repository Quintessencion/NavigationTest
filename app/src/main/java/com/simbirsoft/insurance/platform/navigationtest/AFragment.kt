package com.simbirsoft.insurance.platform.navigationtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_a.*

class AFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_show_text.setOnClickListener {

            val action = AFragmentDirections.actionNavigationToExtraFragment("Улька")
            Navigation.findNavController(it).navigate(action)
        }
    }
}
