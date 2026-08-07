package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui.SchedulingScreen
import com.example.ui.theme.CharcoalBg
import com.example.ui.theme.JadsonBarberTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      JadsonBarberTheme {
        Scaffold(
          modifier = Modifier.fillMaxSize(),
          containerColor = CharcoalBg
        ) { innerPadding ->
          SchedulingScreen(modifier = Modifier.padding(innerPadding))
        }
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun SchedulingScreenPreview() {
  JadsonBarberTheme {
    SchedulingScreen()
  }
}

