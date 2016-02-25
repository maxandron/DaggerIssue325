package com.maxandron.daggerissue325java.bar

import com.maxandron.daggerissue325java.BaseActivity
import com.maxandron.daggerissue325java.MyApplication

import javax.inject.Inject

class BarActivity : BaseActivity() {

    @Inject
    lateinit var mBar: Bar

    override fun setupComponent() {
        MyApplication.get(this).appComponent.plus(BarProvider(this)).inject(this)
    }
}
