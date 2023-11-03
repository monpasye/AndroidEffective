package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.AppTheme
import com.example.myapplication.ui.theme.TransparentDarkBlue

@Composable
fun LolScreenHeader(
    modifier: Modifier = Modifier,
) {
    HeaderBackground(
        painter = painterResource(R.drawable.bg_header),
        modifier = Modifier
            .fillMaxWidth()
    )
    LolLogo(
        painter = painterResource(R.drawable.lol_logo),
        modifier = Modifier
            .padding(48.dp)
    )
    LoL(
        painter = painterResource(R.drawable.lol_stars),
        modifier = Modifier
            .padding(horizontal = 100.dp,
                vertical = 10.dp)
    )
}

@Composable
private fun LoL(
    painter: Painter,
    modifier: Modifier = Modifier,
){
    Box(modifier = modifier){
        Image(
            painter = painterResource(id = R.drawable.lol_stars),
            contentDescription = null,
            modifier = Modifier
                .padding(
                    top = 210.dp,
                    start = 10.dp)
        )
    }
}

@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier){
        Image(
            painter = painterResource(id = R.drawable.bg_header),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
            )
    }
}

@Composable
private fun LolLogo(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(top = 200.dp, start = 30.dp)
            .size(80.dp)
            .border(
                2.dp,
                Color.Transparent,
                RoundedCornerShape(15.dp)
            )
            .clip(RoundedCornerShape(15.dp))
            .background(color = TransparentDarkBlue)
    ){
        Image(
            painter = painterResource(id = R.drawable.lol_logo),
            contentDescription = null,
            modifier = Modifier.size(70.dp)
        )
    }
}

@Preview
@Composable
fun LolScreenHeaderPreview(){
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        LolScreenHeader()
    }
}