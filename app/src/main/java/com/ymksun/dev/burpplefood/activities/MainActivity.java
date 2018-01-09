package com.ymksun.dev.burpplefood.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ymksun.dev.burpplefood.R;
import com.ymksun.dev.burpplefood.adapters.GuidelineFoodAdapter;
import com.ymksun.dev.burpplefood.adapters.MainPagerAdapter;
import com.ymksun.dev.burpplefood.adapters.NearestFoodListAdapter;
import com.ymksun.dev.burpplefood.adapters.NearestFoodTagAdapter;
import com.ymksun.dev.burpplefood.adapters.PromotionFoodListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.vp_toolbar_main_images)
    ViewPager vpToolbarImages;

    @BindView(R.id.rv_near_food_tag)
    RecyclerView rvNearFoodTag;

    @BindView(R.id.rv_near_food_list)
    RecyclerView rvNearFoodList;

    @BindView(R.id.rv_promotion_food_list)
    RecyclerView rvPromotionFoodList;

    @BindView(R.id.rv_guideline_food_list)
    RecyclerView rvGuidelineFoodList;

    private MainPagerAdapter mainPagerAdapter;
    private NearestFoodTagAdapter mNearestFoodTagAdapter;
    private NearestFoodListAdapter mNearestFoodListAdapter;
    private PromotionFoodListAdapter mPromotionFoodListAdapter;
    private GuidelineFoodAdapter mGuidelineFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this, this);

        mainPagerAdapter = new MainPagerAdapter(getApplicationContext());
        vpToolbarImages.setAdapter(mainPagerAdapter);
        vpToolbarImages.setOffscreenPageLimit(mainPagerAdapter.getCount());

        mNearestFoodTagAdapter = new NearestFoodTagAdapter(getApplicationContext());
        rvNearFoodTag.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        rvNearFoodTag.setAdapter(mNearestFoodTagAdapter);

        mNearestFoodListAdapter = new NearestFoodListAdapter(getApplicationContext());
        rvNearFoodList.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        rvNearFoodList.setAdapter(mNearestFoodListAdapter);

        mPromotionFoodListAdapter = new PromotionFoodListAdapter(getApplicationContext());
        rvPromotionFoodList.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        rvPromotionFoodList.setAdapter(mPromotionFoodListAdapter);

        mGuidelineFoodAdapter = new GuidelineFoodAdapter(getApplicationContext());
        rvGuidelineFoodList.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        rvGuidelineFoodList.setAdapter(mGuidelineFoodAdapter);
    }
}
