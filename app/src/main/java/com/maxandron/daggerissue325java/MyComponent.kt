package com.maxandron.daggerissue325java

import com.maxandron.daggerissue325java.bar.BarComponent
import com.maxandron.daggerissue325java.bar.BarProvider
import com.maxandron.daggerissue325java.foo.FooComponent
import com.maxandron.daggerissue325java.foo.FooProvider

import javax.inject.Singleton

import dagger.Component

@Singleton
@Component(modules = arrayOf(MyProvider::class))
interface MyComponent {
    operator fun plus(provider: FooProvider): FooComponent

    operator fun plus(barProvider: BarProvider): BarComponent
}
