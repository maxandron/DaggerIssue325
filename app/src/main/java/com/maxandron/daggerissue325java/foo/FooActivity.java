package com.maxandron.daggerissue325java.foo;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.maxandron.daggerissue325java.BaseActivity;
import com.maxandron.daggerissue325java.MyApplication;

import javax.inject.Inject;

public class FooActivity extends BaseActivity {

    @Inject
    Foo foo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setupComponent() {
        MyApplication.get(this).getAppComponent().plus(new FooProvider(this)).inject(this);
    }
}
