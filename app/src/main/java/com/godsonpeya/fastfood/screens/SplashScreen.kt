package com.godsonpeya.fastfood.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.godsonpeya.fastfood.R
import com.godsonpeya.fastfood.navigation.AppScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {

    val scale = remember {
        Animatable(0f)
    }
    LaunchedEffect(key1 = true) {
        scale.animateTo(targetValue = 0.9f,
            animationSpec = tween(durationMillis = 800,
                easing = {
                    OvershootInterpolator(8f)
                        .getInterpolation(it)
                }))
        delay(2000)
        navController.navigate(AppScreens.AuthScreen.name)
    }
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().scale(scale.value)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.launched),
                contentDescription = "logo",
                modifier = Modifier.size(130.dp))
            Surface(modifier = Modifier
                .clip(shape = CircleShape.copy(topEnd = CornerSize(3.dp),
                    bottomStart = CornerSize(3.dp))),
                color = MaterialTheme.colors.background) {
                Text(text = "Fruit Hub",
                    modifier = Modifier.padding(horizontal = 30.dp),
                    style = MaterialTheme.typography.subtitle1,
                    fontSize = 24.sp)
            }
        }
    }
}