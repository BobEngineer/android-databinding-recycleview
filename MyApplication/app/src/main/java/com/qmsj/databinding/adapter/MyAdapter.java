package com.qmsj.databinding.adapter;

import com.qmsj.databinding.R;
import com.qmsj.databinding.adapter.base.BaseAdapter;
import com.qmsj.databinding.adapter.base.BindingHolder;
import com.qmsj.databinding.databinding.MainItemBinding;
import com.qmsj.databinding.entity.User;

/**
 * MyAdapter
 * Created by qmsj on 2016/1/11.
 */
public class MyAdapter extends BaseAdapter<User> {
    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        MainItemBinding binding = (MainItemBinding) holder.getBinding();
        binding.setUser(getItem(position));
        binding.executePendingBindings();
    }

    @Override
    public int getConvertView(int viewType) {
        return R.layout.main_item;
    }
}
