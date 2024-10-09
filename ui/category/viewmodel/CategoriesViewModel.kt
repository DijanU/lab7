package com.example.lab_7.ui.category.viewmodel

package com.example.lab_7.ui.categories.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab_7.ui.categories.repository.CategoriesRepository
import com.example.lab_7.ui.categories.model.Categories
import kotlinx.coroutines.launch
import retrofit2.Response

class CategoriesViewModel : ViewModel() {
    private val repository = CategoriesRepository()

    var categories: Response<Categories>? = null

    fun loadCategories() {
        viewModelScope.launch {
            categories = repository.getCategories()
        }
    }
}
