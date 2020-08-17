package com.hollander.koindemo.modules

import com.hollander.koindemo.models.Friend
import com.hollander.koindemo.models.SchoolCourse
import com.hollander.koindemo.models.Student
import com.hollander.koindemo.repositories.SchoolRepository
import com.hollander.koindemo.ui.school.SchoolFragment
import com.hollander.koindemo.ui.school.SchoolViewModel
import com.hollander.koindemo.ui.withParameters.ParameterizedViewModel
import com.hollander.koindemo.ui.withParameters.SchoolWithParametersFragment
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.fragment.dsl.fragment
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val schoolModule = module {
    // Defines a singleton class of SchoolCourse
    single { SchoolCourse(androidContext()) }

    // Defines a factory (creates new instance every time)
    factory { Student(get(), get()) }
    factory { Friend() }

    factory { SchoolRepository() }
}

val schoolUIModule = module {
    fragment { SchoolFragment(get()) }
    viewModel { SchoolViewModel(get()) }
}

val anotherUIModule = module {
    fragment { SchoolWithParametersFragment() }
    viewModel { (title: String) ->
        ParameterizedViewModel(
            title
        )
    }
}
