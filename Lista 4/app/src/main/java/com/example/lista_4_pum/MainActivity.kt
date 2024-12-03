    package com.example.lista_4_pum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.lista_4_pum.ui.theme.Lista_4_pumTheme
// jak sa wyswietlane dane zadania na liscie
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(text = "Jeden")
                Text(text = "Dwa")
            }
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
    Lista_4_pumTheme {
        Greeting("Android")
    }
}
    // pytanie do listy 3 // przykladowe pytania odnosnie listy 3
    // czym jest recycler
    // w jaki sposob wyswietlane sa dane elementy na liscie
    // czym jest recycler view na czym on polega
    // ViewHolder o co chodzi i co on nam daje
    // Kontenery, co sie zmienia a co sie nie zmienia
    // intend co to jest i za co odpowiada
    //