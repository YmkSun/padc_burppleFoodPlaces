package com.ymksun.dev.burpplefood.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.ymksun.dev.burpplefood.R;
import com.ymksun.dev.burpplefood.viewholders.GuidelineFoodViewHolder;

import java.util.Arrays;

/**
 * Created by yemyokyaw on 1/9/18.
 */

public class GuidelineFoodAdapter extends BaseRecyclerAdapter<GuidelineFoodViewHolder, String> {

    String[] arrData = {"food", "food", "food", "food", "food"};

    public GuidelineFoodAdapter(Context context) {
        super(context);
        mData = Arrays.asList(arrData);
    }

    @Override
    public GuidelineFoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflator.inflate(R.layout.view_guideline_food, parent, false);
        return new GuidelineFoodViewHolder(itemView);
    }
}
