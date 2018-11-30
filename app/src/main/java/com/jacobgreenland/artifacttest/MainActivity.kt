package com.jacobgreenland.artifacttest

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.jacobgreenland.artifacttest.sync.artifactService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@SuppressLint("CheckResult")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        artifactService.getSetURL("00")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { setUrlResponse ->
                    Log.d("Test", "${setUrlResponse.cdn_root}${setUrlResponse.url}")

                    makeCardSetCall("${setUrlResponse.cdn_root}${setUrlResponse.url}")
                }
    }

    private fun makeCardSetCall(url: String) {
        artifactService.getCardSet(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { cardSetResponse ->
                    Log.d("Test", cardSetResponse.card_set.set_info.name.english)
                    Log.d("Test", cardSetResponse.card_set.card_list[0].card_name.english)
                }
    }
}
