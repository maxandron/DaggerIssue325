package com.maxandron.daggerissue325java.foo;

import dagger.Subcomponent;

@Subcomponent(modules = FooProvider.class)
@FooScope
public interface FooComponent {
    void inject(FooActivity activity);
}
