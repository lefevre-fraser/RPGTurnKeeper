package com.example.rpgturnkeeper

import android.content.Context
import android.database.DataSetObserver
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.ListAdapter as DefaultListAdapter

class ListAdapter<VH : RecyclerView.ViewHolder>(var context: Context, var stringArray: Array<String>,
                                                diffCallback: DiffUtil.ItemCallback<String>
) : DefaultListAdapter<String, VH>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        TODO("Not yet implemented")
    }

}