package com.example.lab_7.ui.mealdetail.repository

import com.example.lab_7.networking.response.MealApiService
import com.example.lab_7.networking.response.RetrofitInstance

package com.example.lab_7.ui.mealdetail.repository
import com.example.lab_7.ui.mealdetail.model.MealDetail
import retrofit2.Response

class MealDetailRepository {
    private val apiService: MealApiService = RetrofitInstance.api

    suspend fun getMealDetails(mealId: String): Response<MealDetail> {
        return apiService.getMealDetails(mealId)
    }
}
