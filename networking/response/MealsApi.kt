package com.example.lab_7.networking.response

import com.example.lab_7.ui.category.repository.Categories
import com.example.lab_7.ui.mealdetail.repository.Filters
import com.example.lab_7.ui.meals.repository.Lookups
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApiService {
    @GET("categories.php")
    suspend fun getCategories(): Response<Categories>

    @GET("filter.php")
    suspend fun getMealsByCategory(@Query("c") category: String): Response<Filters>

    @GET("lookup.php")
    suspend fun getMealDetails(@Query("i") mealId: String): Response<Lookups>


}