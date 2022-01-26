package ru.vlas_ilya.rememberit.ui.features.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ru.vlas_ilya.rememberit.ui.components.messagecard.MessageCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model: MainViewModel by viewModels()

        setContent {
            MainActivityView(model)
        }
    }
}

@Composable
fun MainActivityView(mainViewMode: MainViewModel) {
    MessageCard(
        name = mainViewMode.name.value,
        onChangeName = mainViewMode::setName
    )
}

@Preview
@Composable
fun PreviewMainActivityView() {
    MainActivityView(MainViewModel())
}
