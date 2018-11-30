package com.jacobgreenland.artifacttest.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class SubType(@PrimaryKey var name: String? = null) : RealmObject() {

}