package io.devexpert.composerecompositions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.devexpert.composerecompositions.ui.screens.ColumnKeys
import io.devexpert.composerecompositions.ui.screens.DeferRead
import io.devexpert.composerecompositions.ui.screens.DerivedState
import io.devexpert.composerecompositions.ui.screens.LazyListKeys
import io.devexpert.composerecompositions.ui.theme.ComposeRecompositionsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //StableState()
            //LazyListKeys()
            //ColumnKeys()
            //DerivedState()
            DeferRead()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeRecompositionsTheme {
        Greeting("Android")
    }
}