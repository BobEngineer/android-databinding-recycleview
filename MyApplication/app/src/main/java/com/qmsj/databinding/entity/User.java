package com.qmsj.databinding.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.qmsj.databinding.BR;

/**
 * User
 * Created by qmsj on 2016/1/11.
 */
public class User extends BaseObservable {

    private int id;

    private String name;

    private String avatar;

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        notifyPropertyChanged(BR.avatar);
    }
}
