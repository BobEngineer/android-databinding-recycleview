package com.qmsj.databinding.common;

import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * BindingAdapter
 * Created by qmsj on 2016/1/11.
 */
public class BindingAdapter {

    @android.databinding.BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView imageView, String url) {
        ImageLoader.getInstance().displayImage(url, imageView);
    }
}
