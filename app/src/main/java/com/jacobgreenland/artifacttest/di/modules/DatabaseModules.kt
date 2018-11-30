package com.jacobgreenland.tcghub_pokemon.di.modules

import com.jacobgreenland.artifacttest.database.RealmDatabase
import dagger.Module
import dagger.Provides

@Module
class DatabaseModules {
    @Provides
    fun realmDatabase(): RealmDatabase {
        return RealmDatabase()
    }
}