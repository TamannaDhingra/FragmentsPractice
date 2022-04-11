package com.android.fragmentspractice.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.android.fragmentspractice.R
import com.android.fragmentspractice.databinding.InflaterviewBinding

class Fragment3Adapter(val fragThree: FragmentThree,
                       val list: List<NamesModel>,
) : RecyclerView.Adapter<Fragment3Adapter.viewHolder>() {

    inner class viewHolder(val binding: InflaterviewBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val binding = DataBindingUtil.inflate<InflaterviewBinding>(
            LayoutInflater.from(parent.context),
            R.layout.inflaterview, parent, false
        )
        return viewHolder(binding)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.binding.tvNames.text=list.get(position).names

      /*  holder.binding.CheckBox.setOnChec {
        fragThree.setCheckbox(position)
        }
*/
        holder.binding.CheckBox.isChecked = list.get(position).isChecked==true

        holder.binding.CheckBox.setOnClickListener {
            fragThree.setCheckbox(position,holder.binding.CheckBox.isChecked)
        }

    }

    override fun getItemCount(): Int {
       return list.size
    }
}