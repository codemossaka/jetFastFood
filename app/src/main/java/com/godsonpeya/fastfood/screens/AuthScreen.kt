package com.godsonpeya.fastfood.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.godsonpeya.fastfood.R
import com.godsonpeya.fastfood.navigation.AppScreens

@Composable
fun AuthScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier
            .weight(.6f)
            .fillMaxWidth(), contentAlignment = Alignment.Center) {
            Column(modifier = Modifier.padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 90.dp, end = 80.dp),
                    contentAlignment = Alignment.TopEnd) {
                    Image(painter = painterResource(id = R.drawable.small_banner),
                        contentDescription = "",
                        modifier = Modifier.scale(3f))
                }
                Image(
                    painter = painterResource(id = R.drawable.banner_two),
                    contentDescription = "",
                    modifier = Modifier.scale(3f),
                )
            }
        }
        Card(modifier = Modifier
            .weight(.4f)
            .background(Color.Yellow)
            .fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 30.dp, vertical = 40.dp),
                verticalArrangement = Arrangement.SpaceBetween,
            ) {
                Column {
                    Text(text = "What is your firstname?", style = MaterialTheme.typography.h5)
                    Spacer(modifier = Modifier.height(20.dp))
                    OutlinedTextField(
                        value = "", onValueChange = {},
                        colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = White),
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFF3F1F1)),
                        placeholder = {
                            Text(text = "Tony")
                        }
                    )
                }
                Button(onClick = {
                    navController.navigate(AppScreens.WelcomeScreen.name)
                },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(6.dp)) {
                    Text(text = "Let’s Continue", modifier = Modifier.padding(vertical = 10.dp))
                }
            }
        }
    }
}