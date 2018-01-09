package com.ymksun.dev.burpplefood.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.ymksun.dev.burpplefood.R;
import com.ymksun.dev.burpplefood.viewholders.PromotionFoodListViewHolder;

import java.util.Arrays;

/**
 * Created by yemyokyaw on 1/9/18.
 */

public class PromotionFoodListAdapter extends BaseRecyclerAdapter<PromotionFoodListViewHolder, String> {

    String[] arrData = {"food", "food", "food", "food", "food"};

    public PromotionFoodListAdapter(Context context) {
        super(context);
        mData = Arrays.asList(arrData);
    }

    @Override
    public PromotionFoodListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflator.inflate(R.layout.view_promotion_food, parent, false);
        return new PromotionFoodListViewHolder(itemView);
    }
}
