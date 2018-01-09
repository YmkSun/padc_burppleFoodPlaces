package com.ymksun.dev.burpplefood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.ymksun.dev.burpplefood.R;
import com.ymksun.dev.burpplefood.viewholders.BaseViewHolder;
import com.ymksun.dev.burpplefood.viewholders.NearestFoodTagViewHolder;

import java.util.Arrays;

/**
 * Created by yemyokyaw on 1/8/18.
 */

public class NearestFoodTagAdapter extends BaseRecyclerAdapter<BaseViewHolder, String> {

    String[] arrData = {"food", "food", "food", "food", "food"};

    public NearestFoodTagAdapter(Context context) {
        super(context);
        mData = Arrays.asList(arrData);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflator.inflate(R.layout.view_near_food_tag, parent, false);
        return new NearestFoodTagViewHolder(itemView);
    }
}
