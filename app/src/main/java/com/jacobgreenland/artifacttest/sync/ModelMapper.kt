package com.jacobgreenland.artifacttest.sync

import com.jacobgreenland.artifacttest.models.*
import com.jacobgreenland.artifacttest.models.Set
import com.jacobgreenland.artifacttest.models.sync.CardResponse
import com.jacobgreenland.artifacttest.models.sync.CardSetResponse
import com.jacobgreenland.artifacttest.models.sync.ReferencesResponse
import com.jacobgreenland.artifacttest.models.sync.TextResponse
import io.realm.RealmList
import java.util.*

object ModelMapper {

    fun responseToSet(response: CardSetResponse, expireTime: String): Set {
        return Set(response.set_info.set_id,
                response.set_info.pack_item_def,
                textResponseToTextObject(response.set_info.name),
                Date(expireTime.toLong()))
    }

    fun responseToCardList(response: CardSetResponse): List<Card> {
        val list = mutableListOf<Card>()
        response.card_list.forEach {
            list.add(responseToCard(it))
        }
        return list
    }

    fun responseToCard(response: CardResponse): Card {
        return Card(
                response.card_id,
                response.base_card_id,
                if (response.card_type.isNullOrEmpty()) null else CardType(response.card_type),
                textResponseToTextObject(response.card_name),
                textResponseToTextObject(response.card_text),
                SimpleTextObject(response.mini_image),
                textResponseToTextObject(response.large_image),
                textResponseToTextObject(response.ingame_image),
                response.hit_points,
                response.illustrator,
                getColorFromResponse(response),
                if (response.sub_type.isNullOrEmpty()) null else SubType(response.sub_type),
                if (response.rarity.isNullOrEmpty()) null else Rarity(response.rarity),
                response.item_def,
                response.gold_cost,
                response.mana_cost,
                response.attack,
                response.armour,
                responseToReferences(response.references)
        )
    }

    fun getColorFromResponse(response: CardResponse): Color? {
        return when {
            response.is_green -> Color("Green")
            response.is_black -> Color("Black")
            response.is_blue -> Color("Blue")
            response.is_red -> Color("Red")
            else -> null
        }
    }

    fun responseToReferences(response: List<ReferencesResponse>): RealmList<Reference> {
        val list = RealmList<Reference>()
        response.forEach {
            list.add(toReference(it))
        }
        return list
    }

    fun toReference(response: ReferencesResponse): Reference {
        return Reference(response.card_id, response.ref_type, response.count)
    }


    fun textResponseToTextObject(response: TextResponse): TextObject? {
        val obj = TextObject(response)
        return if (obj.isAllEmpty()) null else obj
    }
}