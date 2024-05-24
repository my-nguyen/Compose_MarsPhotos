package com.nguyen.compose_marsphotos

import android.app.Application
import com.nguyen.compose_marsphotos.data.AppContainer
import com.nguyen.compose_marsphotos.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}