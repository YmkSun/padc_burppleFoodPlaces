package com.ymksun.dev.burpplefood.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.ymksun.dev.burpplefood.R;
import com.ymksun.dev.burpplefood.viewholders.NearestFoodListViewHolder;

import java.util.Arrays;

/**
 * Created by yemyokyaw on 1/9/18.
 */

public class NearestFoodListAdapter extends BaseRecyclerAdapter<NearestFoodListViewHolder, String> {

    String[] arrData = {"food", "food", "food", "food", "food"};

    public NearestFoodListAdapter(Context context) {
        super(context);
        mData = Arrays.asList(arrData);
    }

    @Override
    public NearestFoodListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflator.inflate(R.layout.view_short_list, parent, false);
        return new NearestFoodListViewHolder(itemView);
    }
}
