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
                   var mini_image: TextResponse,
                   var large_image: TextResponse,
                   var ingame_image: TextResponse,
                   var hit_points: Int = -1,
                   var references: List<ReferencesResponse>
)

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

class ReferencesResponse()

/*
"card_set": {
    "version": 1,
    "set_info": {
      "set_id": 0,
      "pack_item_def": 0,
      "name": {
        "english": "Base Set",
        "german": "Basisset",
        "french": "Ensemble de base",
        "italian": "Set di base",
        "koreana": "\u00ea\u00b8\u00b0\u00eb\u00b3\u00b8 \u00ec\u201e\u00b8\u00ed\u0160\u00b8",
        "spanish": "Conjunto base",
        "schinese": "\u00e5\u0178\u00ba\u00e7\u00a1\u20ac\u00e5\u00a5\u2014\u00e7\u2030\u0152",
        "tchinese": "\u00e5\u0178\u00ba\u00e7\u00a4\u017d\u00e5\u00a5\u2014\u00e7\u2030\u0152",
        "russian": "\u00d0\u2018\u00d0\u00b0\u00d0\u00b7\u00d0\u00be\u00d0\u00b2\u00d1\u2039\u00d0\u00b9 \u00d0\u00bd\u00d0\u00b0\u00d0\u00b1\u00d0\u00be\u00d1\u20ac",
        "thai": "Base Set",
        "japanese": "\u00e5\u0178\u00ba\u00e6\u0153\u00ac\u00e3\u201a\u00bb\u00e3\u0192\u0192\u00e3\u0192\u02c6",
        "portuguese": "Base Set",
        "polish": "Base Set",
        "danish": "Base Set",
        "dutch": "Base Set",
        "finnish": "Base Set",
        "norwegian": "Base Set",
        "swedish": "Base Set",
        "hungarian": "Base Set",
        "czech": "Base Set",
        "romanian": "Base Set",
        "turkish": "Base Set",
        "brazilian": "Conjunto Base",
        "bulgarian": "Base Set",
        "greek": "Base Set",
        "ukrainian": "Base Set",
        "latam": "Set de base",
        "vietnamese": "Base Set"
      }
    },
    "card_list": [
      {
        "card_id": 1000,
        "base_card_id": 1000,
        "card_type": "Stronghold",
        "card_name": {
          "english": "Ancient Tower",
          "german": "Uralter Turm",
          "french": "Tour de l'Ancien",
          "italian": "Torre dell'Antico",
          "koreana": "\u00ea\u00b3 \u00eb\u0152\u20ac \u00ed\u008f\u00ac\u00ed\u0192\u2018",
          "spanish": "Torre ancestral",
          "schinese": "\u00e9\u0081\u2014\u00e8\u00bf\u00b9\u00e5\u00a1\u201d",
          "tchinese": "\u00e9\u0081\u00ba\u00e8\u00b7\u00a1\u00e5\u00a1\u201d",
          "russian": "\u00d0\u201d\u00d1\u20ac\u00d0\u00b5\u00d0\u00b2\u00d0\u00bd\u00d1\u008f\u00d1\u008f \u00d0\u00b1\u00d0\u00b0\u00d1\u02c6\u00d0\u00bd\u00d1\u008f",
          "thai": "Ancient Tower",
          "japanese": "\u00e3\u201a\u00a8\u00e3\u0192\u00b3\u00e3\u201a\u00b7\u00e3\u201a\u00a7\u00e3\u0192\u00b3\u00e3\u0192\u02c6\u00e3\u201a\u00bf\u00e3\u0192\u00af\u00e3\u0192\u00bc",
          "portuguese": "Ancient Tower",
          "polish": "Ancient Tower",
          "danish": "Ancient Tower",
          "dutch": "Ancient Tower",
          "finnish": "Ancient Tower",
          "norwegian": "Ancient Tower",
          "swedish": "Ancient Tower",
          "hungarian": "Ancient Tower",
          "czech": "Ancient Tower",
          "romanian": "Ancient Tower",
          "turkish": "Ancient Tower",
          "brazilian": "Torre Ancestral",
          "bulgarian": "Ancient Tower",
          "greek": "Ancient Tower",
          "ukrainian": "Ancient Tower",
          "latam": "Torre Ancestral",
          "vietnamese": "Ancient Tower"
        },
        "card_text": {

        },
        "mini_image": {
          "default": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000.91b2ed80da07ef5cf343540b09687fbf875168c8.png"
        },
        "large_image": {
          "default": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_english.d3abe86ed7ab446bcebe784d0052310d4672b86d.png",
          "german": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_german.201ed581f6855b4520bc166aba4a632338a82fde.png",
          "french": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_french.376a2bdf770532d7dbd1274438cc7983fff8f652.png",
          "italian": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_italian.4938f9b6894aa6e2f297093c70faec458f3ecdc0.png",
          "koreana": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_koreana.50a45bb0e7eae0a6ad145b3b5123623042946e11.png",
          "spanish": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_spanish.209b8b07070c433516562985e987d4724782e570.png",
          "schinese": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_schinese.adf6b4e4e5f462f50b42853a80d490111699fa1d.png",
          "tchinese": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_tchinese.70c1e4e6dbed72d8f59b06ae7a7a14eb9dd5ee16.png",
          "russian": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_russian.47e6b44851277415f3f586775aa2afa0cca2ee53.png",
          "japanese": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_japanese.d515d1d6e58f6a790410b6119e5b3e50d9f5ed38.png",
          "brazilian": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_brazilian.d54c33497ed01ce008fdd47c8835280e89df08da.png",
          "latam": "https:\/\/steamcdn-a.akamaihd.net\/apps\/583950\/icons\/set00\/1000_large_latam.d54c33497ed01ce008fdd47c8835280e89df08da.png"
        },
        "ingame_image": {

        },
        "hit_points": 80,
        "references": [

        ]
      },
 */