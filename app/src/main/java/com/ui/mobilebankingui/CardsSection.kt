package com.ui.mobilebankingui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.mobilebankingui.data.Card
import com.ui.mobilebankingui.ui.theme.BlueEnd
import com.ui.mobilebankingui.ui.theme.BlueStart
import com.ui.mobilebankingui.ui.theme.BlackStart
import com.ui.mobilebankingui.ui.theme.BlackEnd
import com.ui.mobilebankingui.ui.theme.OrangeEnd
import com.ui.mobilebankingui.ui.theme.OrangeStart
import com.ui.mobilebankingui.ui.theme.Purple40
import com.ui.mobilebankingui.ui.theme.PurpleEnd
import com.ui.mobilebankingui.ui.theme.PurpleStart

val cards = listOf(


    Card(
        "VISA",
        "3476 8897 7867 3467",
        "Ayo menabung sekarang!!",
        69.69987,
        color = getGradient(Purple40, Purple40)
    ),
    Card(
        "MASTER CARD",
        "1234 2345 2345 2334",
        "Dapatkan kartu member gratis",
        420.69,
        color = getGradient(Purple40, Purple40)
    ),
    Card(
        "VISA",
        "9877 3224 3455 3245",
        "Bayarkan Uang kuliahmu di BCA!!",
        39.69,
        color = getGradient(Purple40, Purple40)
    ),
    Card(
        "MASTER CARD",
        "4455 3456 3453 3455",
        "Dapatkan rekining gratis!!",
        10000.69,
        color = getGradient(Purple40, Purple40)
    )
)

fun getGradient(
    startColor : Color,
    endColor : Color
): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}

@Preview
@Composable
fun CardsSection() {
    LazyRow{
       items(cards.size){index ->  
           CardItem(index)
       }
    }
}

@Composable
fun CardItem(
    index : Int
) {
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if (index == cards.size-1){
        lastItemPaddingEnd = 16.dp
    }

    var image = painterResource(id = R.drawable.bni)
    if(card.cardType == "MASTER CARD"){
        image = painterResource(id = R.drawable.bca)
    }


    Box(modifier = Modifier
        .padding(start = 16.dp, end = lastItemPaddingEnd)
    ){
        Column (
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .clickable { }
                .padding(vertical = 20.dp, horizontal = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween
        ){

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = card.cardName,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "$ ${card.balance}",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = card.cardNumber,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}





















