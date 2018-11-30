package com.jacobgreenland.artifacttest.models.sync

class SetURLResponse(var cdn_root : String = "",
                     var url: String = "",
                     var expire_time: String = "")

class CardSetOverallResponse(var card_set: CardSetResponse)

class CardSetResponse(var version: Int = -1,
                      var set_info: SetInfoResponse,
                      var card_list: List<CardResponse>)

class SetInfoResponse(var set_id: Int = -1,
                      var pack_item_def: Int = -1,
                      var name: TextResponse)

class CardResponse(var card_id: Int = -1,
                   var base_card_id: Int = -1,
                   var card_type: String? = null,
                   var card_name: TextResponse,
                   var card_text: TextResponse,
                   var mini_image: SimpleTextResponse,
                   var large_image: TextResponse,
                   var ingame_image: TextResponse,
                   var hit_points: Int = -1,
                   var illustrator: String? = null,
                   var is_green: Boolean = false,
                   var is_black: Boolean = false,
                   var is_blue: Boolean = false,
                   var is_red: Boolean = false,
                   var sub_type: String? = null,
                   var rarity: String? = null,
                   var item_def: Int = -1,
                   var gold_cost: Int = -1,
                   var mana_cost: Int = -1,
                   var attack: Int = -1,
                   var armour: Int = -1,
                   var references: List<ReferencesResponse>
)

class SimpleTextResponse(var default: String? = null)

class TextResponse(var default: String? = null,
                   var english: String? = null,
                   var german: String? = null,
                   var french: String? = null,
                   var italian: String? = null,
                   var koreana: String? = null,
                   var spanish: String? = null,
                   var schinese: String? = null,
                   var tchinese: String? = null,
                   var russian: String? = null,
                   var thai: String? = null,
                   var japanese: String? = null,
                   var portuguese: String? = null,
                   var polish: String? = null,
                   var danish: String? = null,
                   var dutch: String? = null,
                   var finnish: String? = null,
                   var norwegian: String? = null,
                   var swedish: String? = null,
                   var hungarian: String? = null,
                   var czech: String? = null,
                   var romanian: String? = null,
                   var turkish: String? = null,
                   var brazilian: String? = null,
                   var bulgarian: String? = null,
                   var greek: String? = null,
                   var ukrainian: String? = null,
                   var latam: String? = null,
                   var vietnamese: String? = null)

class ReferencesResponse(var card_id: Int = -1,
                         var ref_type: String? = null,
                         var count: Int = -1)

