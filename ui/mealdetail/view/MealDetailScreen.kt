package com.example.lab_7.ui.mealdetail.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.lab_7.ui.mealdetail.model.MealDetail

@Composable
fun MealDetailScreen(navController: NavHostController, mealDetail: MealDetail) {
    Column {
        Text(text = mealDetail.strMeal)
        Text(text = mealDetail.strInstructions)
        // Aquí puedes agregar más detalles como imágenes o ingredientes
    }
}
