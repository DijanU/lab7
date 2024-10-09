package com.example.lab_7.ui.category.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth


@Composable
fun MealListScreen(navController: NavHostController, meals: String?) {
    LazyColumn {
        items(meals) { meal ->
            Text(
                text = meal.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("meal_detail/${meal.id}")
                    }
            )
        }
    }
}
