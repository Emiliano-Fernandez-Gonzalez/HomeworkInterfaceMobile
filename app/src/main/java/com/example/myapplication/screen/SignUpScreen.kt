package com.example.myapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplication.R

@Composable
fun SignUpScreen(navController: NavHostController) {
    // Purple Background
    Box(
    modifier = Modifier
    .fillMaxSize()
    .background(Color(0xFF4A43B5)),
    contentAlignment = Alignment.Center
    ) {

        // White Card
        Box(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .fillMaxHeight(0.9f)
                .background(Color.White, RoundedCornerShape(40.dp))
                .padding(24.dp),
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize(),

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {

                // Main image *i cropped and copied the image so it has extra padding
                Image(
                    painter = painterResource(id = R.drawable.ic_illustration),
                    contentDescription = "Illustration",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                )

                //these boxes are fake spacers
                Box(modifier = Modifier.height(30.dp))

                // Signup
                Text(
                    text = "Signup",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.Black
                )

                Box(modifier = Modifier.height(8.dp))


                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Email") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )

                Box(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )


                Box(modifier = Modifier.height(16.dp))

                // Signup Button
                Box(
                    modifier = Modifier
                        .align (Alignment.End)
                        .width(140.dp)
                        .height(50.dp)
                        .background(
                            Color(0xFF4A43B5),
                            RoundedCornerShape(30.dp)
                        ),
                    contentAlignment = Alignment.Center,

                    ) {
                    Text(
                        text = "Sign up",
                        color = Color.White,
                        fontWeight = FontWeight.Black
                    )
                }



                Box(modifier = Modifier.height(24.dp))

                // Back Button
                Button(
                    onClick = { navController.navigate("login") },
                    modifier = Modifier
                        .width(250.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(30.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4A43B5)
                    )
                ) {
                    Text(
                        text = "Back",
                        color = Color.White,
                        fontWeight = FontWeight.Black
                    )
                }

            }
        }
    }

}