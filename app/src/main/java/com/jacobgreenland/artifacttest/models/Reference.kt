package com.jacobgreenland.artifacttest.models

import io.realm.RealmObject

open class Reference(var cardId: Int = -1,
                     var refType: String? = null,
                     var count: Int = -1) : RealmObject()