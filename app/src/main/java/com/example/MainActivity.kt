package com.example

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      MyApplicationTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
          GpeScreen(modifier = Modifier.padding(innerPadding))
        }
      }
    }
  }
}

@Composable
fun GpeScreen(modifier: Modifier = Modifier) {
  val context = LocalContext.current

  Column(
    modifier = modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(
      text = "Welcome to GPE Android App!",
      fontSize = 24.sp,
      fontWeight = FontWeight.Bold
    )
    
    Spacer(modifier = Modifier.height(20.dp))
    
    Button(
      onClick = {
        Toast.makeText(context, "GPE App is working perfectly!", Toast.LENGTH_SHORT).show()
      }
    ) {
      Text(text = "Click Me")
    }
  }
}

@Preview(showBackground = true)
@Composable
fun GpeScreenPreview() {
  MyApplicationTheme { GpeScreen() }
}
