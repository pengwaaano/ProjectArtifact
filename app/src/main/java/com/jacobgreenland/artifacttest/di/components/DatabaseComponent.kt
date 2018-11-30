package com.jacobgreenland.tcghub_pokemon.di.components

import com.jacobgreenland.artifacttest.MainActivity
import com.jacobgreenland.artifacttest.views.fragments.base.BaseFragment
import com.jacobgreenland.tcghub_pokemon.di.modules.DatabaseModules
import dagger.Component

@Component(modules = [DatabaseModules::class])
interface DatabaseComponent {
    fun inject(baseFragment: BaseFragment)
    fun inject(mainActivity: MainActivity)
}