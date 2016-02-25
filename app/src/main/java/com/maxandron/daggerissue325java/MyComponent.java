package com.maxandron.daggerissue325java;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyProvider.class)
public interface  MyComponent {
    FooComponent plus(FooProvider provider);

    BarComponent plus(BarProvider barProvider);
}
