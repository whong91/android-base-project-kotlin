package com.waihong.androidbaseprojecttestapp.module.child_fragment.first


import androidx.recyclerview.widget.LinearLayoutManager
import com.waihong.androidbaseprojectmodule.base.fragment.BaseFragment

import com.waihong.androidbaseprojecttestapp.R
import kotlinx.android.synthetic.main.fragment_first_child.*
import javax.inject.Inject

class FirstChildFragment : BaseFragment<FirstChildFragmentView, FirstChildFragmentPresenter>(), FirstChildFragmentView {

    override var dataArrayList: ArrayList<String>? = null

    @Inject
    override lateinit var dataAdapter: DataAdapter

    @Inject
    override lateinit var linearLayoutManager: LinearLayoutManager

    override fun setupRecyclerView() {
        recyclerview_firstchildfragment.adapter = dataAdapter
        recyclerview_firstchildfragment.setHasFixedSize(true)
        recyclerview_firstchildfragment.layoutManager = linearLayoutManager
    }

    override fun getLayoutId(): Int = R.layout.fragment_first_child




}
