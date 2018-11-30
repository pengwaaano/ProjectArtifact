package com.jacobgreenland.artifacttest.sync

import com.google.gson.GsonBuilder
import com.jacobgreenland.artifacttest.models.sync.CardSetOverallResponse
import com.jacobgreenland.artifacttest.models.sync.SetURLResponse
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url

interface ArtifactApi {
    @GET("{path}/")
    fun getSetURL(@Path("path") path: String): Single<SetURLResponse>

    @GET
    fun getCardSet(@Url url: String): Single<CardSetOverallResponse>
}

val artifactService = Retrofit.Builder()
        .baseUrl("https://playartifact.com/cardset/")
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().serializeNulls().create()))
        .build()
        .create(ArtifactApi::class.java)