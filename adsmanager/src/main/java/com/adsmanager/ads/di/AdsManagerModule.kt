package com.adsmanager.ads.di

import com.adsmanager.ads.AdsManager
import com.adsmanager.ads.AdsManagerOpenAd
import com.adsmanager.ads.HandleAds
import com.adsmanager.fan.FanAds
import org.koin.dsl.module

val adsManagerModule = module {
    single { FanAds() }
    single { HandleAds(get()) }
    single { AdsManager(get()) }
    single { AdsManagerOpenAd() }
}