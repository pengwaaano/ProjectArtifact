package com.jacobgreenland.artifacttest

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val config = RealmConfiguration.Builder()
//                .assetFile("base.realm")
                .name("base.realm")
                .schemaVersion(1) // Must be bumped when the schema changes
                .build()
        Realm.setDefaultConfiguration(config)
    }
}