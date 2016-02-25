package com.maxandron.daggerissue325java.bar;

import dagger.Subcomponent;

@BarScope
@Subcomponent(modules = BarProvider.class)
public interface BarComponent {
    void inject(BarActivity activity);
}
