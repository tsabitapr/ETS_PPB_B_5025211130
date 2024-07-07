package com.ui.mobilebankingui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.compose.material3.ButtonDefaults


@Composable
fun VerificationScreen(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Image(painter = painterResource(id = R.drawable.logostart), contentDescription = "Login image",
            modifier = Modifier.size(200.dp))

        Text(text = "Transfer Sukses", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

//        Text(text = "Login to your account")

//        Spacer(modifier = Modifier.height(16.dp))
//
//        OutlinedTextField(value = pin, onValueChange = {
//            pin = it
//        }, label = {
//            Text(text = "Masukan Pin")
//        })


        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
//            Log.i("Credential", "Bank : $pin")
            navController.navigate("home")
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF115DA9), // Custom hex color
                contentColor = Color.White
            )) {
            Text(text = "Kembali ke Beranda")
        }

        Spacer(modifier = Modifier.height(32.dp))

//        Text(text = "Forgot Password", modifier = Modifier.clickable {
//
//        })
//
//        Spacer(modifier = Modifier.height(32.dp))
//
//        Text(text = "Or sign in with")
//
//        Row(
//            modifier = Modifier.fillMaxWidth().padding(40.dp),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            Image(painter = painterResource(id = R.drawable.facebook),
//                contentDescription = "Facebook",
//                modifier = Modifier.size(50.dp).clickable {
//                    //Facebook clicked
//                }
//            )
//
//            Image(painter = painterResource(id = R.drawable.google),
//                contentDescription = "Google",
//                modifier = Modifier.size(50.dp).clickable {
//                    //Google clicked
//                }
//            )
//
//            Image(painter = painterResource(id = R.drawable.twitter),
//                contentDescription = "Twitter",
//                modifier = Modifier.size(50.dp).clickable {
//                    //Twitter clicked
//                }
//            )
//        }
    }
}