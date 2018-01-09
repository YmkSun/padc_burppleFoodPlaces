package com.ymksun.dev.burpplefood.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ymksun.dev.burpplefood.R;

/**
 * Created by yemyokyaw on 1/6/18.
 */

public class MainPagerAdapter extends PagerAdapter {

    LayoutInflater mLayoutInflater;

    public MainPagerAdapter(Context context) {
        super();
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.view_burpple_main_image,container,false);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }
}
