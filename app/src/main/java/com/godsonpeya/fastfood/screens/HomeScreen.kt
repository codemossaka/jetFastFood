package com.godsonpeya.fastfood.screens

import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Tune
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.godsonpeya.fastfood.R
import com.godsonpeya.fastfood.component.ProductCard
import com.godsonpeya.fastfood.data.data
import com.godsonpeya.fastfood.ui.theme.Purple200
import kotlin.random.Random

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(topBar = {
        TopAppBar(title = {},
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painter = painterResource(id = R.drawable.ic_menu),
                        contentDescription = "Menu")
                }
            },
            actions = {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .clickable { }) {
                    Icon(painter = painterResource(id = R.drawable.ic_bascket),
                        contentDescription = "Menu",
                        modifier = Modifier.size(24.dp),
                        tint = Purple200)
                    Text(text = "My basket",
                        color = Color.Black,
                        style = MaterialTheme.typography.caption.copy(fontSize = 10.sp))
                }
            },
            modifier = Modifier.height(90.dp),
            backgroundColor = Color.White,
            elevation = 0.dp)
    }) {
        Surface(modifier = Modifier.padding(it)) {
            Column(modifier = Modifier.padding(20.dp)) {

                Box(modifier = Modifier) {
                    Text(text = buildAnnotatedString {
                        withStyle(style = SpanStyle()) {
                            append("Hello Tony, What fruit salad \n\n")
                        }
                        withStyle(style = SpanStyle()) {
                            append("combo do you want today?")
                        }
                    }, color = Purple200, fontSize = 20.sp)
                }

                Row(modifier = Modifier
                    .padding(vertical = 20.dp)
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center) {
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = Color.White,
                            focusedBorderColor = Color.White),
                        modifier = Modifier.background(
                            Color(0xFFF3F1F1),
                            shape = CircleShape.copy(CornerSize(20.dp)),
                        ),
                        placeholder = {
                            Text(text = "Search for fruit salad combos")
                        },
                        leadingIcon = {
                            Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
                        },
                    )
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Tune, contentDescription = "f")
                    }
                }

                LazyVerticalGrid(cells = GridCells.Adaptive(128.dp), content = {


                    item(span = { GridItemSpan(2) }) {
                        Text(text = data[0].name)
                    }
                    items(data[0].products) { product ->
                        ProductCard(product = product,
                            modifier = Modifier.animateItemPlacement(tween(durationMillis = 250)))
                    }

                })
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly) {
                    data[1].name.split(",").forEach { str ->
                        Text(text = str, fontSize = 24.sp)
                    }
                }
                LazyRow(content = {
                    items(data[1].products) { product ->
                        ProductCard(product = product,
                            imageSize=80.dp,
                            backgroundColor =
                            listOf<Color>(
                                Color(0xFFF44336),
                                Color(0xFF8BC34A),
                                Color(0xFF9C27B0),
                                Color(0xFF3F51B5),
                                Color(0xFF03A9F4),
                                Color(0xFF009688),
                                Color(0xFFFFEB3B),
                                Color(0xFFFF9800),
                                Color(0xFFFF5722),
                            )[Random.nextInt(0, 8)]
                        )
                    }
                })
            }
        }

    }
}