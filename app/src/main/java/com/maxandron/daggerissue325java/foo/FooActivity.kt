package com.maxandron.daggerissue325java.foo

import android.os.Bundle

import com.maxandron.daggerissue325java.BaseActivity
import com.maxandron.daggerissue325java.MyApplication

import javax.inject.Inject

class FooActivity : BaseActivity() {

    @Inject
    lateinit var foo: Foo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun setupComponent() {
        MyApplication[this].appComponent.plus(FooProvider(this)).inject(this)
    }
}
