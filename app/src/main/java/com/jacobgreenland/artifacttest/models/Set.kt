package com.jacobgreenland.artifacttest.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Set(@PrimaryKey var setId: Int = -1,
               var packItemDef: Int = -1,
               var name: TextObject? = null,
               var dataExpireTime: Date? = null) : RealmObject()