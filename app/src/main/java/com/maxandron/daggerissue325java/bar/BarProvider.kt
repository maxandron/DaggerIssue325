package com.maxandron.daggerissue325java.bar

import dagger.Module
import dagger.Provides

@Module
class BarProvider(private val view: BarActivity) {

    @Provides @BarScope fun provideView() = view

    @Provides @BarScope fun provideFooOrBar() = Bar()
}
