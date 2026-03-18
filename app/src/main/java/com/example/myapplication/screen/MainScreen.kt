package com.example.myapplication.screen

import android.util.Patterns
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplication.R
import androidx.compose.foundation.lazy.items
import com.example.myapplication.components.Contact

@Composable
fun MainScreen(navController: NavHostController){
    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }

    var nameError by remember { mutableStateOf(false) }
    var phoneError by remember { mutableStateOf(false) }
    var contacts by remember {
        mutableStateOf(
            listOf(Pair("Juan", "123"), Pair("Marta", "456"), Pair("Joaquin", "789"))
        )
    }

    fun isValidName(name: String) : Boolean{
        return name.matches(Regex("^[a-zA-Z ]+$"))
    }

    fun isValidPhone(phone: String): Boolean{
        return phone.matches(Regex("^[0-9]{10}$"))
    }

    var formValid = isValidPhone(phone) && isValidName(name)

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

            ) {
                LazyColumn(
                    modifier = Modifier.weight(1f)
                ) {
                    items (contacts){
                            contact ->
                        Contact(name = contact.first, phone = contact.second)
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))
                //Name
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
                        .height(56.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(12.dp))

                //Phone
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
                        .height(56.dp),
                    shape = RoundedCornerShape(10.dp),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(12.dp))
                
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.padding(vertical = 10.dp)
                ) {
                    //Add button
                    Button(
                        onClick ={
                            if (
                                name.isNotEmpty() && phone.isNotEmpty()
                            ) {
                                contacts = contacts + Pair(name, phone)

                                name = ""
                                phone = ""
                            }

                        },
                        modifier = Modifier
                            .width(140.dp)
                            .height(50.dp),
                        enabled = formValid,
                        shape = RoundedCornerShape(30.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF4A43B5)
                        )
                    ) {
                        Text(
                            text = "Add",
                            color = Color.White,
                            fontWeight = FontWeight.Black
                        )
                    }

                    Button(
                        onClick ={
                            contacts = emptyList()
                        },
                        modifier = Modifier
                            .width(140.dp)
                            .height(50.dp),
                        shape = RoundedCornerShape(30.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF4A43B5)
                        )
                    ) {
                        Text(
                            text = "Clear",
                            color = Color.White,
                            fontWeight = FontWeight.Black
                        )
                    }
                }
            }





        }
    }


}