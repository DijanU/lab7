package com.example.lab_7.ui.category.repository

package com.example.lab_7.ui.categories.repository

import com.example.lab_7.networking.MealApiService
import com.example.lab_7.networking.RetrofitInstance
import com.example.lab_7.ui.categories.model.Categories
import retrofit2.Response

class CategoriesRepository {
    private val apiService: MealApiService = RetrofitInstance.api

    suspend fun getCategories(): Response<Categories> {
        return apiService.getCategories()
    }
}
