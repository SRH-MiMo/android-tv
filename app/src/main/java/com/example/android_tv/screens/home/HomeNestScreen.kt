package com.example.android_tv.screens.home

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text
import com.example.android_tv.R
import com.example.android_tv.ui.theme.PurpleGradient

import com.example.android_tv.ui.theme.Typography
import com.example.android_tv.widgets.TvButton

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun HomeNestedScreen(navController: NavController) {

    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.home_background),
                contentScale = ContentScale.FillBounds
            )
            .padding(start = 40.dp, top = 52.5.dp)
    ) {
        Column {
            Column(
                verticalArrangement = Arrangement.spacedBy(34.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("어젯밤에 ")
                        withStyle(
                            style = SpanStyle(
                                brush = PurpleGradient
                            )
                        ) {
                            append("6")
                        }
                        append("시간 ")
                        withStyle(
                            style = SpanStyle(
                                brush = PurpleGradient
                            )
                        ) {
                            append("23")
                        }
                        append("분 동안 숙면을 취했습니다.")

                    },
                    style = Typography.bodyLarge,
                    fontSize = 20.sp,
                    color = Color.White
                )

                Text(
                    text = "수면 시간\nAM 12:30 ~ AM 06:53",
                    style = Typography.bodyLarge,
                    fontSize = 12.5.sp,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(175.5.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(28.5.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "미라클 모닝을 위해 1분간 명상하세요",
                    fontSize = 15.sp,
                    style = Typography.bodyLarge,
                )

                TvButton(
                    modifier = Modifier
                        .width(250.dp)
                        .height(50.dp)
                        .background(
                            brush = PurpleGradient,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(14.5.dp),
                    onClick = {
                        Toast.makeText(context, "led 슈웅", Toast.LENGTH_SHORT).show()

                        //TODO https 통신으로 Post요청보내기
                        // des https://io.adafruit.com/api/v2/{유저네임}/feeds/{feed_key}/data
                        // body { "value": "값(string)"}
                        // refrence http://lhdangerous.godohosting.com/wiki/index.php/Adafruit_IO_(io.adafruit.com)_IoT_%ec%84%9c%eb%b2%84%eb%a1%9c_%ed%99%9c%ec%9a%a9%ed%95%98%ea%b8%b0#RESTful_API
                        // refrence https://io.adafruit.com/api/docs

                    },

                    ) {
                    Text(
                        text = "완료",
                        fontSize = 18.sp,
                        style = Typography.bodyMedium,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}