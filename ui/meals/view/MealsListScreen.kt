package com.example.lab_7.ui.meals.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.lab_7.ui.mealdetail.repository.Meal

class MealsListScreen {
    package com.example.lab_7.ui.meals.view

    import androidx.compose.foundation.clickable
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.lazy.LazyColumn
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Modifier
    import androidx.navigation.NavHostController
    import com.example.lab_7.ui.meals.model.Meal

    @Composable
    fun MealListScreen(navController: NavHostController, meals: List<Meal>) {
        LazyColumn {
            items(meals) { meal ->
                Text(
                    text = meal.strMeal,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("meal_detail/${meal.idMeal}")
                        }
                )
            }
        }
    }
