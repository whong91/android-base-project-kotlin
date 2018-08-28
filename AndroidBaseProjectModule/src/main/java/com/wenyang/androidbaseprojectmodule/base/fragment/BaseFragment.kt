package com.wenyang.androidbaseprojectmodule.base.fragment

import android.content.Context
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wenyang.androidbaseprojectmodule.base.BasePresenter
import com.wenyang.androidbaseprojectmodule.base.BaseView
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject


abstract class BaseFragment<out V : BaseView, P : BasePresenter<V>>  : Fragment(), HasSupportFragmentInjector{

    //making it optional instead of lateinit to allow pass setup data even the fragment is not created yet
    @JvmField
    @Inject
    var presenter : P? = null

    @Inject
    lateinit var activityContext : Context

    @Inject
    lateinit var childFragmentInjector : DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = childFragmentInjector

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        setHasOptionsMenu(enableOptionMenu())
        return inflater.inflate(getLayoutId(), container, false)
    }

    open fun enableOptionMenu(): Boolean{
        return false
    }

    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        retainInstance = true
    }

    override fun onAttach(context: Context?) {

        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }


    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        presenter?.onStart(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        presenter?.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter?.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        presenter?.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        presenter?.onEnd()
        super.onDestroyView()
    }
}