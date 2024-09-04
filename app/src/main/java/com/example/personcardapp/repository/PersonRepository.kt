package com.example.personcardapp.repository

import com.example.personcardapp.R
import com.example.personcardapp.model.Person

fun getAllPersons(): List<Person> {
    return R.drawable::class.java.fields.filter { it.name.startsWith("pic_") }.map {
        val split = it.name.split("_")
        return@map Person(it.getInt(null), split[1], split[2], split[3])
    }
}