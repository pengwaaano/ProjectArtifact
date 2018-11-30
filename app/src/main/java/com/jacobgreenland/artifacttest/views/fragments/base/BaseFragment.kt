package com.jacobgreenland.artifacttest.views.fragments.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.jacobgreenland.artifacttest.database.RealmDatabase
import com.jacobgreenland.tcghub_pokemon.di.components.DaggerDatabaseComponent
import javax.inject.Inject

abstract class BaseFragment : Fragment() {

    @Inject
    lateinit var database: RealmDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerDatabaseComponent.create().inject(this)
    }
}