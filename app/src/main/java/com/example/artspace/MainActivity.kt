package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    val imageResource = painterResource(id = R.drawable.japanese_landscape_with_samurai___wallpaper_4k_by_jmasaryk_dhkmy30)
    Image(
        painter = imageResource,
        contentDescription = null,
        modifier = Modifier
            .size(400.dp, 300.dp)
            .padding(
                top = 10.dp, bottom = 20.dp, start = 30.dp, end = 30.dp
            ))
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


