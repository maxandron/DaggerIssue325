package com.maxandron.daggerissue325java.bar;

import com.maxandron.daggerissue325java.BaseActivity;
import com.maxandron.daggerissue325java.MyApplication;

import javax.inject.Inject;

public class BarActivity extends BaseActivity {

    @Inject
    Bar mBar;

    @Override
    protected void setupComponent() {
        MyApplication.get(this).getAppComponent().plus(new BarProvider(this)).inject(this);
    }
}
