package com.maxandron.daggerissue325java.foo

import dagger.Subcomponent

@Subcomponent(modules = arrayOf(FooProvider::class))
@FooScope
interface FooComponent {
    fun inject(activity: FooActivity)
}
