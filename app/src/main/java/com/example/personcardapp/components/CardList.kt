package com.example.personcardapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.personcardapp.model.Person

@Composable
fun CardList(persons: List<Person>) {
    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
        persons.map {
            PersonCard(it)
        }
    }
}