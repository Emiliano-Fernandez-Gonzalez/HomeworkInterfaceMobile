@file:JvmName("SignupScreenKt")

package com.example.myapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun LoginScreen(navController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    var passConfirm by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }

    var emailError by remember { mutableStateOf(false) }
    var nameError by remember { mutableStateOf(false) }
    var passError by remember { mutableStateOf(false) }
    var phoneError by remember {mutableStateOf(false)}




    fun isValidEmail(email: String): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun isValidName(name: String) : Boolean{
        return name.matches(Regex("^[a-zA-Z ]+$"))
    }

    fun isValidPhone(phone: String): Boolean{
        return phone.matches(Regex("^[0-9]{10}$"))
    }

    fun passwordsMatch(password1:String, password2:String): Boolean{
        return password1 == password2
    }

    var formValid =
        name.isNotEmpty() &&
        email.isNotEmpty() &&
        pass.isNotEmpty() &&
        passConfirm.isNotEmpty() &&
        phone.isNotEmpty() &&
        isValidName(name) &&
        isValidEmail(email) &&
        isValidPhone(phone) &&
        passwordsMatch(pass, passConfirm)

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

                // Sign Up
                Text(
                    text = "Sign Up",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.Black
                )

                Box(modifier = Modifier.height(8.dp))

                // Text Field
                OutlinedTextField(
                    value = name,
                    onValueChange = {
                        name = it
                        nameError = !isValidName(it)
                    },
                    label = { Text("Name") },
                    isError = nameError,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )

                Box(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = email,
                    onValueChange = {
                        email = it
                        emailError = !isValidEmail(it) },
                    label = { Text("Email") },
                    isError = emailError,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )

                Box(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = pass,
                    onValueChange = {
                        pass = it
                        passError = !passwordsMatch(pass, passConfirm)
                    },
                    label = { Text("Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )

                Box(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = passConfirm,
                    onValueChange = {
                        passConfirm = it
                        passError = !passwordsMatch(pass, passConfirm)
                    },
                    label = { Text("Confirm password") },
                    isError = passError,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )

                Box(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = phone,
                    onValueChange = {
                        phone = it
                        phoneError = !isValidPhone(it)
                    },
                    label = { Text("Phone") },
                    isError = phoneError,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )

                Box(modifier = Modifier.height(16.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    // SignUp Button
                    Button(
                        onClick = { navController.navigate("welcome") },    //no main screen yet
                        enabled = formValid,
                        modifier = Modifier

                            .width(250.dp)
                            .height(50.dp),
                        shape = RoundedCornerShape(30.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF4A43B5)
                        )
                    ) {
                        Text(
                            text = "Sign Up",
                            color = Color.White,
                            fontWeight = FontWeight.Black
                        )
                    }

                    // Back Button
                    Button(
                        onClick = { navController.navigate("welcome") },
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

}
