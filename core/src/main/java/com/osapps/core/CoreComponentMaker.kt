package com.osapps.core

import android.app.Application
import com.osapps.core.di.AppModule
import com.osapps.core.di.CoreComponent
import com.osapps.core.di.DaggerCoreComponent

lateinit var coreComponent: CoreComponent


fun initCoreDI(app: Application) {
    coreComponent = DaggerCoreComponent.builder().appModule(AppModule(app)).build()
}
