import com.example.lab_7.networking.response.MealApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Response

class MealsWebService {

    private lateinit var api: MealApiService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")  // URL base de la API
            .addConverterFactory(GsonConverterFactory.create())   // Convertidor Gson para JSON
            .build()

        api = retrofit.create(MealApiService::class.java)
    }

    // Función suspendida para obtener categorías de comidas
    suspend fun getMealsCategories(): MealsCategoriesResponse? {
        return try {
            val response: Response<MealsCategoriesResponse> = api.getMealsCategories()
            if (response.isSuccessful) {
                response.body()  // Devuelve el cuerpo de la respuesta si fue exitosa
            } else {
                null  // Maneja error de respuesta no exitosa
            }
        } catch (e: Exception) {
            e.printStackTrace()  // Captura excepciones y las imprime
            null
        }
    }

    // Función suspendida para filtrar comidas por categoría
    suspend fun filterMealsByCategory(category: String): MealResponse? {
        return try {
            val response: Response<MealResponse> = api.filterByCategory(category)
            if (response.isSuccessful) {
                response.body()  // Devuelve el cuerpo de la respuesta si fue exitosa
            } else {
                null  // Maneja error de respuesta no exitosa
            }
        } catch (e: Exception) {
            e.printStackTrace()  // Captura excepciones y las imprime
            null
        }
    }
}

