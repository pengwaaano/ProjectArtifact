package com.jacobgreenland.artifacttest.models

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Card(
        @PrimaryKey var cardId: Int = -1,
        var baseCardId: Int = -1,
        var cardType: CardType? = null,
        var cardName: TextObject? = null,
        var cardText: TextObject? = null,
        var miniImage: SimpleTextObject? = null,
        var largeImage: TextObject? = null,
        var ingameImage: TextObject? = null,
        var hitPoints: Int = -1,
        var illustrator: String? = null,
        var color: Color? = null,
        var subType: SubType? = null,
        var rarity: Rarity? = null,
        var itemDef: Int = -1,
        var goldCost: Int = -1,
        var manaCost: Int = -1,
        var attack: Int = -1,
        var armour: Int = -1,
        var references: RealmList<Reference>? = null
) : RealmObject() {

}