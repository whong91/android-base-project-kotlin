package com.waihong.androidbaseprojectmodule.base


abstract class BasePresenter<out T : BaseView>
protected constructor(protected val view: T) : Presenter {


}