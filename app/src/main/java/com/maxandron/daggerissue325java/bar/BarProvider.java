package com.maxandron.daggerissue325java.bar;

import dagger.Module;
import dagger.Provides;

@Module
public class BarProvider {
    private final BarActivity view;

    public BarProvider(BarActivity view) {
        this.view = view;
    }

    @Provides
    @BarScope
    BarActivity provideView() {
        return view;
    }

    @Provides
    @BarScope
    Bar provideFooOrBar() {
        return new Bar();
    }
}
