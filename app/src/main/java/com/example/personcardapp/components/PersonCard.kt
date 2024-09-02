package com.example.personcardapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.personcardapp.R

@Composable
fun PersonCard(imageId: Int, firstName: String, lastName: String, occupation: String){
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.pic_bruno_mars_musician),
                contentDescription = "image",
                modifier = Modifier.height(100.dp)
            )
            Column {
                Text(text = "Name: $firstName $lastName")
                Text(text = "Occupation: $occupation", fontSize = 10.sp)
            }
        }
    }
}

@Preview
@Composable
fun PersonCardPreview(){
    PersonCard(
        imageId = R.drawable.pic_bruno_mars_musician,
        firstName = "Bruno",
        lastName = "Mars",
        occupation = "Musician"
    )
}