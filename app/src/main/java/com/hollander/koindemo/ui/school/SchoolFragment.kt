package com.hollander.koindemo.ui.school

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.hollander.koindemo.MainActivity
import com.hollander.koindemo.R
import com.hollander.koindemo.models.Student
import kotlinx.android.synthetic.main.main_fragment.*
import org.koin.android.ext.android.get

class SchoolFragment(private val viewModel: SchoolViewModel) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.student.observe(viewLifecycleOwner, Observer { student ->
            student.beSmart()

            val anotherStudent = get<Student>()
            val anotherStudent2: Student = get()

            anotherStudent.beSmart()
            anotherStudent2.beSmart()
        })

        btn.setOnClickListener { (requireActivity() as MainActivity).openAnotherFragment() }
    }
}