package com.example.lab_7.ui.meals.repository

package com.example.lab_7.ui.meals.repository

import com.example.lab_7.networking.MealApiService
import com.example.lab_7.networking.RetrofitInstance
import com.example.lab_7.ui.meals.model.MealsResponse
import retrofit2.Response

class MealsRepository {
    private val apiService: MealApiService = RetrofitInstance.api

    suspend fun getMealsByCategory(category: String): Response<MealsResponse> {
        return apiService.getMealsByCategory(category)
    }
}
