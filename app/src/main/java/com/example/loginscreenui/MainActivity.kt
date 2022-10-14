package com.example.loginscreenui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginscreenui.ui.theme.GreyM
import com.example.loginscreenui.ui.theme.LoginScreenUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreenUITheme {
                   Login()
            }
        }
    }
}

@Composable
fun Login() {
    var username by remember { mutableStateOf("Username")}
    var password by remember { mutableStateOf("Password")}
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.femaler),
            contentDescription = "female reading", contentScale =   ContentScale.Fit
        )
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
                .background(GreyM),
            horizontalAlignment = Alignment.CenterHorizontally,

            )
        {
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Welcome Back!", fontWeight = FontWeight.Bold, fontSize = 40.sp)
            Text(text = "You've been missed")
            OutlinedTextField (value = username, onValueChange = {username=it} )
            OutlinedTextField (value = password, onValueChange = {password=it})



        }
    }


}