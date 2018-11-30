package com.jacobgreenland.artifacttest.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Rarity(@PrimaryKey var name: String? = null) : RealmObject() {

}