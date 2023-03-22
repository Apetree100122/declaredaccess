package com.sample.hackathon.declaredaccessandroid.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sample.hackathon.declaredaccessandroid.navigation.ProtectedRoutesNav

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home",
            modifier = Modifier.padding(20.dp),
            fontSize = 20.sp
        )
        Button(onClick = {
            // TODO - call MSAL.logout() and update navigation
        }, modifier = Modifier.padding(16.dp)) {
            Text("Log out")
        }
        Button(onClick = {
            navController.navigate(ProtectedRoutesNav.PROFILE_SCREEN)
        }, modifier = Modifier.padding(16.dp)) {
            Text("Profile")
        }
    }
}

@Preview
@Composable
fun HomePreview() {
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}