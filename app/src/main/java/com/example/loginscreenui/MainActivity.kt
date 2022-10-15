package com.example.loginscreenui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
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
    var username by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
            .background(GreyM),
        horizontalAlignment = Alignment.End
    )
    {
        Image(
            painter = painterResource(id = R.drawable.femaler),
            contentDescription = "female reading", modifier = Modifier.size(300.dp), contentScale = ContentScale.Inside
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
            Spacer(modifier = Modifier.height(30.dp))
            OutlinedTextField (value = username,
                leadingIcon = {(Icon(
                painter = painterResource(id = R.drawable.man),
                contentDescription = "Username Icon" ,
                    modifier = Modifier.size(24.dp)))},
                onValueChange = {username=it},
                maxLines = 1,
                label={Text(text="Username")})
          OutlinedTextField (value = password,
               leadingIcon = { Icon(
                painter = painterResource(id = R.drawable.key),
                contentDescription = "password Icon",
                   modifier = Modifier.size(40.dp))},
              trailingIcon = { Icon(painter = painterResource(id = R.drawable.eye),
                  contentDescription = "eye",
              modifier= Modifier.size(24.dp)) },
               onValueChange = {password=it},
               maxLines = 1,
               label= {Text (text = "Password")},
           visualTransformation = PasswordVisualTransformation())

        }
    }


}