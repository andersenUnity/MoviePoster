package com.andersenunity.filmposter.features.main.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andersenunity.filmposter.ui.theme.robotoFamily

@Composable
fun BottomBar (){
    Row(
        Modifier.fillMaxWidth().background(color = Color.White).padding(bottom = 8.dp, top = 8.dp),
        horizontalArrangement = Arrangement.Center) {
        Card(
            colors = CardDefaults.cardColors(Color.White),
            elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier
                .background(color = Color.Transparent, shape = RoundedCornerShape(10.dp))
                .clickable {},
        ) {
            Text(
                text = "Главная",
                fontSize = 24.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
        }
        Card(
            colors = CardDefaults.cardColors(Color.White),
            elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier
                .background(color = Color.Transparent, shape = RoundedCornerShape(10.dp))
                .clickable {},
        ) {
            Text(
                text = "Аккаунт",
                fontSize = 24.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
        }
    }
}