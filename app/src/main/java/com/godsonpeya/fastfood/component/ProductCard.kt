package com.godsonpeya.fastfood.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.godsonpeya.fastfood.data.Product
import com.godsonpeya.fastfood.ui.theme.Purple200

@Composable
fun ProductCard(
    product: Product,
    modifier: Modifier = Modifier,
    imageSize: Dp = 100.dp,
    backgroundColor: Color = Color.White,
) {
    Card(modifier = modifier
        .padding(15.dp)
        .width(152.dp), backgroundColor = backgroundColor) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier
                .paddingFromBaseline(top = 3.dp)
                .padding(horizontal = 10.dp)
                .fillMaxWidth(), contentAlignment = Alignment.BottomEnd) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "favori",
                        tint = Purple200)
                }
            }
            Box() {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "favori",
                        tint = Purple200)
                }
                Image(
                    painter = painterResource(id = product.image),
                    contentDescription = "dd",
                    modifier = Modifier
                        .size(imageSize)
                        .clip(shape = CircleShape),
                )
            }
            Text(text = product.name, fontWeight = FontWeight.Bold)
            Row(modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = product.price, color = Purple200)
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "dd",
                        tint = Purple200,
                    )
                }
            }
        }
    }
}
