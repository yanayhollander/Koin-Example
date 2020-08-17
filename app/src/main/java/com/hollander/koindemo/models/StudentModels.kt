package com.hollander.koindemo.models

import android.content.Context
import android.util.Log

data class Student(
    val course: SchoolCourse,
    val friend: Friend
) {

    fun beSmart() {
        course.study()
        friend.hangout()
    }
}

class SchoolCourse(val context: Context) {
    fun study() {
        Log.e("Yanay", "I'm studying")
    }
}

class Friend {
    fun hangout() {
        Log.e("Yanay", "We're hanging out")
    }
}