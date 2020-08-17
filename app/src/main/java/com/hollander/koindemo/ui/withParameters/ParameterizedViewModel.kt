package com.hollander.koindemo.ui.withParameters

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ParameterizedViewModel(title: String): ViewModel() {

    val loadTitle = MutableLiveData<String>(title)
}
