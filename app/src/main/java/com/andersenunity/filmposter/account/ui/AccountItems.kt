package com.andersenunity.filmposter.account.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.andersenunity.filmposter.R

@Composable
fun AccountItems() {
    val accItems = listOf(
        stringResource(R.string.termsOfService),
        stringResource(R.string.contactUs),
        stringResource(R.string.reportProblem)
    )
    accItems.forEach {
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = it,
            modifier = Modifier
                .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                .clickable { }
                .padding(4.dp)
                .fillMaxWidth(), style = MaterialTheme.typography.h3
        )
    }
}