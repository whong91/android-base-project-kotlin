package com.wenyang.androidbaseprojectmodule.base.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView

/**
 * Created by wenyang on 19/9/17.
 */


abstract class BaseMapRecycleAdapter<O, V : RecyclerView.ViewHolder>(
        val context: Context
) : RecyclerView.Adapter<V>() {

    var mAdapterItems = ArrayList<AdapterItem>()
    var mBackupAdapterItems = ArrayList<AdapterItem>()

    override fun getItemCount(): Int = mAdapterItems.size

    override fun getItemViewType(position: Int): Int = mAdapterItems[position].type.int

    fun add(item: O) {

        val adapterItem = AdapterObjectItem(item)

        mAdapterItems.add(adapterItem)
        mBackupAdapterItems.add(adapterItem)

        notifyDataSetChanged()
    }

    fun add(type: AdapterItemType) {

        val adapterItem = AdapterItem(type)

        mAdapterItems.add(adapterItem)
        mBackupAdapterItems.add(adapterItem)

        notifyDataSetChanged()
    }

    fun add(items: List<O>) {

        items.mapTo(mAdapterItems) { AdapterObjectItem(it) }
        items.mapTo(mBackupAdapterItems) { AdapterObjectItem(it) }

        notifyDataSetChanged()
    }

    fun isSelected(position: Int) = get(position).selected

    fun setSelected(position: Int) {

        get(position).selected = true

        notifyItemChanged(position)
    }

    fun setDeselected(position: Int) {

        get(position).selected = false

        notifyItemChanged(position)
    }


    fun toggleSelected(position: Int) {

        if (isSelected(position)) {
            setDeselected(position)
        } else {
            setSelected(position)
        }

    }

    fun setAllSelected() {

        getAll().forEach { it.selected = true }

        notifyDataSetChanged()

    }

    fun setAllDeselected() {

        getAll().forEach { it.selected = false }

        notifyDataSetChanged()
    }

    fun getItem(position: Int): Any? {

        val adapterItem = get(position)

        if (adapterItem is AdapterObjectItem<*>) {

            return adapterItem.item
        }

        return null
    }

    fun getItems() = mAdapterItems.mapNotNull {
        it as? AdapterObjectItem<O>
    }

    fun getSelectedAdapterItems() = getAll().filter { it.selected }

    fun getSelectedItems() =
            mAdapterItems.filter {
                it.selected
            }.mapNotNull {
                it as? AdapterObjectItem<O>
            }


    fun get(position: Int): AdapterItem = mAdapterItems[position]

    fun getAll() = mAdapterItems

    fun clear() {
        mAdapterItems.clear()
        mBackupAdapterItems.clear()

        notifyDataSetChanged()
    }

    fun update(items: List<O>) {
        clear()

        add(items)
    }

    interface Callback<in O> {
        fun onClick(item: O, position: Int)
    }

}

open class AdapterItem(val type: AdapterItemType, var selected: Boolean = false)

data class AdapterObjectItem<out O>(val item: O) : AdapterItem(AdapterItemType.ITEM)

enum class AdapterItemType constructor(val int: Int) {

    HEADER(1),
    ITEM(2),
    FOOTER(3),
    LOADING(4),
    A(5),
    B(6),
    C(7),
    D(8),
    E(9),
    OTHER_ITEM(10)

}
