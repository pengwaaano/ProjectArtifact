package com.jacobgreenland.artifacttest

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.jacobgreenland.artifacttest.database.RealmDatabase
import com.jacobgreenland.artifacttest.sync.ModelMapper
import com.jacobgreenland.artifacttest.sync.artifactService
import com.jacobgreenland.tcghub_pokemon.di.components.DaggerDatabaseComponent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@SuppressLint("CheckResult")
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var database: RealmDatabase

    var sets = listOf("00", "01")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerDatabaseComponent.create().inject(this)

        for (set in sets) {
            artifactService.getSetURL(set)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe { setUrlResponse ->
                        Log.d("Test", "${setUrlResponse.cdn_root}${setUrlResponse.url}")

                        makeCardSetCall("${setUrlResponse.cdn_root}${setUrlResponse.url}", setUrlResponse.expire_time)
                    }
        }
    }

    private fun makeCardSetCall(url: String, expireTime: String) {
        artifactService.getCardSet(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { cardSetResponse ->
                    val set = ModelMapper.responseToSet(cardSetResponse.card_set, expireTime)
                    val cardList = ModelMapper.responseToCardList(cardSetResponse.card_set)

                    database.realm.executeTransaction {
                        it.insertOrUpdate(set)
                        it.insertOrUpdate(cardList)
                    }
                }
    }
}
