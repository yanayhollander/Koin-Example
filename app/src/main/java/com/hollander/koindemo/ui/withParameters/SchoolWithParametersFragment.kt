package com.hollander.koindemo.ui.withParameters

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.hollander.koindemo.R
import kotlinx.android.synthetic.main.main_fragment.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class SchoolWithParametersFragment : Fragment() {

    private val viewModel: ParameterizedViewModel by inject { parametersOf("Yanay") }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.loadTitle.observe(viewLifecycleOwner, Observer {
            Log.e("Yanay", "Parameter title: $it")
            btn.text = it
        })


    }
}