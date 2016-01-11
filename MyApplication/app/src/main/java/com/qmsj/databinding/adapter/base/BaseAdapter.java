package com.qmsj.databinding.adapter.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * BaseAdapter 适配器基类
 * Created by qmsj on 2015/11/2.
 */
public abstract class BaseAdapter<T> extends RecyclerView.Adapter<BindingHolder> {

    private List<T> mList = new ArrayList<T>();

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), getConvertView(viewType), parent, false);
        BindingHolder holder = new BindingHolder(binding.getRoot());
        holder.setBinding(binding);
        return holder;
    }

    @Override
    public abstract void onBindViewHolder(BindingHolder holder, int position);

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public T getItem(int position) {
        return mList.get(position);
    }

    public void appentList(List<T> list) {
        mList.addAll(list);
        notifyDataSetChanged();
    }

    public void replaceList(List<T> list) {
        if (list == null) {
            list = new ArrayList<T>();
        }
        mList = list;
        notifyDataSetChanged();
    }

    public abstract int getConvertView(int viewType);

}
