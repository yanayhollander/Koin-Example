package com.hollander.koindemo.repositories

import com.hollander.koindemo.models.Student
import org.koin.java.KoinJavaComponent

class SchoolRepository {
    fun loadStudent() : Student {
        return KoinJavaComponent.getKoin().get()
    }
}