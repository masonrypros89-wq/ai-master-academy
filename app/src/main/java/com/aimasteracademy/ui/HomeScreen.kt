package com.aimasteracademy.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {

    Column(modifier = Modifier.padding(16.dp)) {

        Text("AI Master Academy", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate("learn") }) {
            Text("Learn Mode")
        }

        Button(onClick = { navController.navigate("build") }) {
            Text("Build Mode")
        }

        Button(onClick = { navController.navigate("mentor") }) {
            Text("AI Mentor")
        }

        Button(onClick = { navController.navigate("lab") }) {
            Text("Innovation Lab")
        }
    }
}
