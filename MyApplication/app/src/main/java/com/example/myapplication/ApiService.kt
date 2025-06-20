package com.example.myapplication

object ApiService {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.example.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: MyApi = retrofit.create(MyApi::class.java)
}

interface MyApi {
    @GET("characters")
    suspend fun getCharacters(): List<Character>
}
