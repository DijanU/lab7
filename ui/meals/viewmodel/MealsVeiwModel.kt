package com.example.lab_7.ui.meals.viewmodel

package com.example.lab_7.ui.meals.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab_7.ui.meals.repository.MealsRepository
import com.example.lab_7.ui.meals.model.MealsResponse
import kotlinx.coroutines.launch
import retrofit2.Response

class MealsViewModel : ViewModel() {
    private val repository = MealsRepository()

    var meals: Response<MealsResponse>? = null

    fun loadMeals(category: String) {
        viewModelScope.launch {
            meals = repository.getMealsByCategory(category)
        }
    }
}
