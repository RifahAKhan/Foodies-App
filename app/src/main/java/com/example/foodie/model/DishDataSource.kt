package com.example.foodie.model

import android.content.Context
import android.content.res.AssetManager
import android.util.Log
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future

class DishDataSource {
    companion object {
        val executor: ExecutorService = Executors.newSingleThreadExecutor()

        fun runBackgroundThread(context: Context):Future<ArrayList<Dish>> {
            val callable:Callable<ArrayList<Dish>> = Callable {
                return@Callable parseData(context.assets)
            }
            return executor.submit(callable)
        }

        private fun parseData(assetManager: AssetManager): ArrayList<Dish> {
            var jsonString: String? = null
            val dishList: ArrayList<Dish> = arrayListOf()
            try {
                jsonString =
                    assetManager.open("recipeDetails.json").bufferedReader().use { it.readText() }
            } catch (ioException: IOException) {
                ioException.message?.let { Log.v("File exception", it) }
                ioException.printStackTrace()
            }

            try {
                val dishes = JSONObject(jsonString!!)
                val dishesArray: JSONArray = dishes.getJSONArray("dishes")
                for(i in 0 until dishesArray.length()){
                    val dish:JSONObject = dishesArray.getJSONObject(i)
                    val dishName: String = dish.getString("name")
                    val dishType: String = dish.getString("type")
                    val dishIngredients: String = dish.getString("ingredients")
                    val dishDescription: String = dish.getString("description")
                    val dishImage: String = dish.getString("image")
                    val newDish = Dish(dishName,dishType,dishIngredients,dishDescription,dishImage)
                    dishList.add(newDish)
                }
                Log.v("For Loop",""+dishList.size)
            } catch (e: JSONException) {
                e.stackTrace
                Log.v("Catch block",""+e.message)
            }
            return dishList

        }

    }
}
