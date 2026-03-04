package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //HomeWorkScreen()
            //LoginScreen()
            SignupScreen()
        }
    }
}
@Composable
fun HomeWorkScreen() {

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

                // Hello
                Text(
                    text = "Hello",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.Black
                )

                Box(modifier = Modifier.height(8.dp))

                Text(
                    text = "Welcome To Little Drop, where \nyou manage your daily tasks",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center

                )

                Box(modifier = Modifier.height(30.dp))

                // Login Button
                Box(
                    modifier = Modifier
                        .width(250.dp)
                        .height(50.dp)
                        .background(
                            Color(0xFF4A43B5),
                            RoundedCornerShape(30.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Login",
                        color = Color.White,
                        fontWeight = FontWeight.Black
                    )
                }



                Box(modifier = Modifier.height(20.dp))

                Text(
                    text = "Sign up using",
                    fontSize = 12.sp,
                    color = Color.Gray
                )

                Box(modifier = Modifier.height(32.dp))

                // Other Login Options
                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {

                    // Facebook
                    Box(
                        modifier = Modifier
                            .size(45.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_facebook),
                            contentDescription = "Facebook",
                            modifier = Modifier.size(52.dp)
                        )
                    }

                    // Google
                    Box(
                        modifier = Modifier
                            .size(45.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_google),
                            contentDescription = "Google",
                            modifier = Modifier.size(52.dp)
                        )
                    }

                    // LinkedIn
                    Box(
                        modifier = Modifier
                            .size(45.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_linkedin),
                            contentDescription = "LinkedIn",
                            modifier = Modifier.size(52.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
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

                // Login
                Text(
                    text = "Login",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.Black
                )

                Box(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Name") },
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

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Confirm password") },
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
                    label = { Text("Phone") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )

                Box(modifier = Modifier.height(16.dp))

                // Login Button
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
                        text = "Login",
                        color = Color.White,
                        fontWeight = FontWeight.Black
                    )
                }

                Box(modifier = Modifier.height(24.dp))

            }
        }
    }

}


@Composable
fun SignupScreen() {
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

            }
        }
    }

}