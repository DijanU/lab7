package com.example.lab_7.ui.categories.view  // Asegúrate de que el paquete sea único

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import com.example.lab_7.ui.category.repository.Category

@Composable
fun CategoryListScreen(navController: NavHostController, categories: List<Category>) {
    LazyColumn {
        items(categories) { category ->
            Text(
                text = category.strCategory,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("meal_list/${category.strCategory}")
                    }
            )
        }
    }
}

