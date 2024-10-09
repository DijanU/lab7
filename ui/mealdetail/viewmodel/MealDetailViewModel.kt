package com.example.lab_7.ui.mealdetail.viewmodel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab_7.ui.mealdetail.repository.MealDetailRepository
import com.example.lab_7.ui.mealdetail.model.MealDetail
import kotlinx.coroutines.launch
import retrofit2.Response

class MealDetailViewModel : ViewModel() {
    private val repository = MealDetailRepository()

    var mealDetail: Response<MealDetail>? = null

    fun loadMealDetails(mealId: String) {
        viewModelScope.launch {
            mealDetail = repository.getMealDetails(mealId)
        }
    }
}
