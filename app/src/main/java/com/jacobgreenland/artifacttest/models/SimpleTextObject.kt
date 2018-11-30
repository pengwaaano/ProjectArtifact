package com.jacobgreenland.artifacttest.models

import com.jacobgreenland.artifacttest.models.sync.SimpleTextResponse
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class SimpleTextObject(@PrimaryKey var name: String = "") : RealmObject() {

    constructor(response: SimpleTextResponse) : this() {
        this.name = response.default ?: ""
    }
}