package com.maxandron.daggerissue325java;

import android.app.Application;
import android.content.Context;

/**
 * Created by maxandron on 25/02/16.
 */
public class MyApplication extends Application {
    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    private MyComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mComponent = DaggerMyComponent.builder().myProvider(new MyProvider()).build();
    }

    public MyComponent getAppComponent() {
        return mComponent;
    }
}
