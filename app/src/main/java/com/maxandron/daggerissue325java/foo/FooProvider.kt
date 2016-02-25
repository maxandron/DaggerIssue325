package com.maxandron.daggerissue325java.foo

import dagger.Module
import dagger.Provides

@Module
class FooProvider(private val view: FooActivity) {

    @Provides @FooScope fun provideView() = view

    @Provides @FooScope fun provideFooOrBar() = Foo()
}
