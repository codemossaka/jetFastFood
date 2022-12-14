package com.godsonpeya.fastfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.godsonpeya.fastfood.navigation.FastFoodNavigation
import com.godsonpeya.fastfood.screens.HomeScreen
import com.godsonpeya.fastfood.ui.theme.FastFoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FastFoodTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Text(text = "")
                    val navController = rememberNavController()
                    FastFoodNavigation(navController = navController)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FastFoodTheme {}
}