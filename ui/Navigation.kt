package com.example.lab_7.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab_7.ui.categories.view.CategoryListScreen
import com.example.lab_7.ui.category.view.MealListScreen
import com.example.lab_7.ui.category.viewmodel.CategoriesViewModel
import com.example.lab_7.ui.mealdetail.view.MealDetailScreen

class Navigation {
    @Composable
    fun AppNavigation() {
        val navController = rememberNavController()
        val categoriesViewModel: CategoriesViewModel = viewModel()
        val categories = categoriesViewModel.categories.observeAsState(listOf())

        NavHost(
            navController = navController,
            startDestination = "category_list"
        ) {
            composable("category_list") {
                CategoryListScreen(navController, categories.value) // Pasar la lista de categorías observada
            }
            composable("meal_list/{categoryName}") { backStackEntry ->
                val categoryName = backStackEntry.arguments?.getString("categoryName")
                if (!categoryName.isNullOrEmpty()) {
                    MealListScreen(navController, categoryName)
                } else {
                    navController.navigate("error_screen")
                }
            }
            composable("meal_detail/{mealId}") { backStackEntry ->
                val mealId = backStackEntry.arguments?.getString("mealId")
                if (!mealId.isNullOrEmpty()) {
                    MealDetailScreen(navController, mealId)
                } else {
                    navController.navigate("error_screen")
                }
            }
        }
    }
}
