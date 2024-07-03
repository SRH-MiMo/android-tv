package com.example.android_tv.screens.meditation

import android.content.ContentValues
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import com.example.android_tv.R
import com.example.android_tv.datas.RequestData
import com.example.android_tv.datas.RetrofitInstance
import com.example.android_tv.widgets.TvButton
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun MeditationScreen(
    navController: NavController
) {

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.mmm),
            contentDescription = "meditation",
            modifier = Modifier
                .fillMaxSize()
                .clickable {
                    Toast
                        .makeText(context, "Led 뻥", Toast.LENGTH_SHORT)
                        .show()

                    val input = HashMap<String, Any>()
                    input["value"] = "0"

                    RetrofitInstance.api.sendData(input).enqueue(object : Callback<RequestData> {
                        override fun onResponse(call: Call<RequestData>, response: Response<RequestData>) {
                            if(response.isSuccessful){
                                Log.d(ContentValues.TAG, "onResponse: $response")
                            }
                        }

                        override fun onFailure(call: Call<RequestData>, t: Throwable) {
                            Log.d(ContentValues.TAG, "실패")

                        }
                    })

                    navController.navigate("home")

                },
        )
    }
}

@Preview(device = Devices.TV_1080p)
@Composable
fun MeditationScreenPreview() {
//    MeditationScreen()
}