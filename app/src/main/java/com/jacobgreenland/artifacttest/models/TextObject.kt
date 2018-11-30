package com.jacobgreenland.artifacttest.models

import com.jacobgreenland.artifacttest.models.sync.TextResponse
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class TextObject(
        @PrimaryKey var english: String? = null,
        var default: String? = null,
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
        var vietnamese: String? = null) : RealmObject() {

    constructor(response: TextResponse) : this() {
        this.default = response.default
        this.english = response.english
        this.german = response.german
        this.french = response.french
        this.italian = response.italian
        this.koreana = response.koreana
        this.spanish = response.spanish
        this.schinese = response.schinese
        this.tchinese = response.tchinese
        this.russian = response.russian
        this.thai = response.thai
        this.japanese = response.japanese
        this.portuguese = response.portuguese
        this.polish = response.polish
        this.danish = response.danish
        this.dutch = response.dutch
        this.finnish = response.finnish
        this.norwegian = response.norwegian
        this.swedish = response.swedish
        this.hungarian = response.hungarian
        this.czech = response.czech
        this.romanian = response.romanian
        this.turkish = response.turkish
        this.brazilian = response.brazilian
        this.bulgarian = response.bulgarian
        this.greek = response.greek
        this.ukrainian = response.ukrainian
        this.latam = response.latam
        this.vietnamese = response.vietnamese
    }

    fun isAllEmpty(): Boolean {
        return default.isNullOrEmpty() &&
                english.isNullOrEmpty() &&
                german.isNullOrEmpty() &&
                french.isNullOrEmpty() &&
                italian.isNullOrEmpty() &&
                koreana.isNullOrEmpty() &&
                spanish.isNullOrEmpty() &&
                schinese.isNullOrEmpty() &&
                tchinese.isNullOrEmpty() &&
                russian.isNullOrEmpty() &&
                thai.isNullOrEmpty() &&
                japanese.isNullOrEmpty() &&
                portuguese.isNullOrEmpty() &&
                polish.isNullOrEmpty() &&
                danish.isNullOrEmpty() &&
                dutch.isNullOrEmpty() &&
                finnish.isNullOrEmpty() &&
                norwegian.isNullOrEmpty() &&
                swedish.isNullOrEmpty() &&
                hungarian.isNullOrEmpty() &&
                czech.isNullOrEmpty() &&
                romanian.isNullOrEmpty() &&
                turkish.isNullOrEmpty() &&
                brazilian.isNullOrEmpty() &&
                bulgarian.isNullOrEmpty() &&
                greek.isNullOrEmpty() &&
                ukrainian.isNullOrEmpty() &&
                latam.isNullOrEmpty() &&
                vietnamese.isNullOrEmpty()
    }

}