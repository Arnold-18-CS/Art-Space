package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtworkWall(modifier: Modifier = Modifier){

}

@Composable
fun ArtworkDescription(modifier: Modifier = Modifier){

}

@Composable
fun DisplayController(modifier: Modifier = Modifier){

}

@Composable
fun ArtSpaceLayout(modifier: Modifier){

}

@Preview(
    showSystemUi = true,
    showBackground = true,
    name = "Art Space"
)
@Composable
fun ArtSpaceApp() {
    ArtSpaceTheme {
        ArtSpaceLayout(modifier = Modifier
            .fillMaxSize())
    }
}


