package com.example.android_tv.screens.qr

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import androidx.tv.material3.Text
import com.example.android_tv.R
import com.example.android_tv.ui.theme.Pink80
import com.example.android_tv.ui.theme.Purple80
import com.example.android_tv.ui.theme.PurpleGradient
import com.example.android_tv.ui.theme.Typography
import com.example.android_tv.widgets.TvButton


@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun QrScreen(navController: NavController) {
    val context = LocalContext.current

    Surface {
        Row(
            modifier = Modifier
                .padding(start = 94.dp, top = 51.dp, end = 85.dp, bottom = 81.dp)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(119.5.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(111.5.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {

                Row {
                    Image(
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp),
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "로고"
                    )
                    Spacer(modifier = Modifier.width(18.5.dp))
                    Text(
                        text = "스마트폰에서 로그인",
                        fontSize = 25.sp,
                        style = Typography.bodyMedium
                    )
                }
                Text(
                    text = "QR코드를 카메라로 비추고\n링크를 눌러 로그인 해주세요.",
                    fontSize = 36.sp,
                    style = Typography.bodyMedium,
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
                        navController.navigate("home_screen")
                    },

                    ) {
                    Text(
                        text = "완료",
                        fontSize = 18.sp,
                        style = Typography.bodyMedium,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxSize(),
                    )
                }
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(21.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                Image(
                    modifier = Modifier
                        .width(250.dp)
                        .height(250.dp),
                    painter = painterResource(id = R.drawable.qr),
                    contentDescription = "qr",
                )
                Text(
                    text = "유효시간 04:21 남음",
                    fontSize = 16.sp,
                    style = Typography.bodyMedium,
                )
            }
        }


    }
}

//@Preview(device = Devices.TV_1080p)
//@Composable
//fun QrPreView() {
//    QrScreen(navController = )
//}
