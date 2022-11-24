package com.godsonpeya.fastfood.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.godsonpeya.fastfood.R
import com.godsonpeya.fastfood.navigation.AppScreens

@Composable
fun WelcomeScreen(navController: NavHostController) {
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
                Image(painter = painterResource(id = R.drawable.banner_one),
                    contentDescription = "",
                    modifier = Modifier.scale(3f))
            }
        }
        Card(modifier = Modifier
            .weight(.4f)
            .background(Color.Yellow)
            .fillMaxWidth()) {
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp, vertical = 40.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Column(verticalArrangement = Arrangement.Center) {
                    Text(text = "Get The Freshest Fruit Salad Combo",
                        style = MaterialTheme.typography.h5)
                    Text(text = "We deliver the best and freshest fruit salad in town. Order for a combo today!!!",
                        fontSize = 21.sp)
                }
                Button(onClick = {
                    navController.navigate(AppScreens.HomeScreen.name)},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(6.dp)) {
                    Text(text = "Let’s Continue", modifier = Modifier.padding(vertical = 10.dp))
                }
            }
        }
    }
}