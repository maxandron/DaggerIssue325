package com.maxandron.daggerissue325java;

import dagger.Module;
import dagger.Provides;

@Module
public class FooProvider {
    private final FooActivity view;

    public FooProvider(FooActivity view) {
        this.view = view;
    }

    @Provides
    @FooScope
    FooActivity provideView() {
        return view;
    }

    @Provides
    @FooScope
    Foo provideFooOrBar() {
        return new Foo();
    }
}
