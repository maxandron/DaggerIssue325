package com.maxandron.daggerissue325java

import android.app.Application
import android.content.Context

class MyApplication : Application() {

    lateinit var appComponent: MyComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerMyComponent.builder().myProvider(MyProvider()).build()
    }

    companion object {
        operator fun get(context: Context): MyApplication {
            return context.applicationContext as MyApplication
        }
    }
}
