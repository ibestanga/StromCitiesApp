package com.ibra.dev.stormcitiesapp.home.data.datasource.remote

import com.ibra.dev.stormcitiesapp.home.data.entities.CityEntity
import retrofit2.Response

interface HomeRemoteDataSource {

    suspend fun getCitiesList() : Response<List<CityEntity>>
}