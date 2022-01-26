package ru.vlas_ilya.rememberit.ui.components.messagecard

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MessageCard(
    name: String,
    onChangeName: (String) -> Unit
) {
    Column() {
        Text(text = "Hello $name!")
        TextField(value = name, onValueChange = onChangeName)
    }
}

@Preview
@Composable
fun PreviewMainActivityView() {
    MessageCard(
        name = "Android",
        onChangeName = {}
    )
}
