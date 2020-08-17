package com.hollander.koindemo.ui.school

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hollander.koindemo.models.Student
import com.hollander.koindemo.repositories.SchoolRepository

class SchoolViewModel(schoolRepository: SchoolRepository) : ViewModel() {

    val student = MutableLiveData<Student>(schoolRepository.loadStudent())
}