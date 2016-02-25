package com.maxandron.daggerissue325java.bar

import dagger.Subcomponent

@BarScope
@Subcomponent(modules = arrayOf(BarProvider::class))
interface BarComponent {
    fun inject(activity: BarActivity)
}
