package com.ymksun.dev.burpplefood.activities;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MenuItem;

import com.ymksun.dev.burpplefood.BurppleFoodApp;
import com.ymksun.dev.burpplefood.R;
import com.ymksun.dev.burpplefood.adapters.GuidelineFoodAdapter;
import com.ymksun.dev.burpplefood.adapters.MainPagerAdapter;
import com.ymksun.dev.burpplefood.adapters.NearestFoodListAdapter;
import com.ymksun.dev.burpplefood.adapters.NearestFoodTagAdapter;
import com.ymksun.dev.burpplefood.adapters.PromotionFoodListAdapter;
import com.ymksun.dev.burpplefood.behaviors.BottomNavigationViewBehavior;
import com.ymksun.dev.burpplefood.helpers.BottomNavigationViewHelper;
import com.ymksun.dev.burpplefood.helpers.MainPagerHelper;

import java.util.Timer;
import java.util.TimerTask;

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

    @BindView(R.id.bottom_navigation)
    BottomNavigationView mBottomNavigationView;

    @BindView(R.id.coordinator_layout_main)
    CoordinatorLayout mCoordinatorLayout;

    @BindView(R.id.tab_layout_main_pager)
    TabLayout mTabLayout;

    private MainPagerAdapter mMainPagerAdapter;
    private NearestFoodTagAdapter mNearestFoodTagAdapter;
    private NearestFoodListAdapter mNearestFoodListAdapter;
    private PromotionFoodListAdapter mPromotionFoodListAdapter;
    private GuidelineFoodAdapter mGuidelineFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this, this);

        mMainPagerAdapter = new MainPagerAdapter(getApplicationContext());
        vpToolbarImages.setAdapter(mMainPagerAdapter);
        vpToolbarImages.setOffscreenPageLimit(mMainPagerAdapter.getCount());
        MainPagerHelper.autoScrollPager(vpToolbarImages, mMainPagerAdapter.getCount());
        mTabLayout.setupWithViewPager(vpToolbarImages, true);

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

        BottomNavigationViewHelper.removeShiftMode(mBottomNavigationView);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) mBottomNavigationView.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationViewBehavior());
        mBottomNavigationView.setSelectedItemId(R.id.menu_explore);
        mBottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_explore:
                                Log.d(BurppleFoodApp.LOG_TAG, "menu explore");
                            case R.id.menu_all_guides:
                                Log.d(BurppleFoodApp.LOG_TAG, "menu all guides");
                            case R.id.menu_add:
                                Log.d(BurppleFoodApp.LOG_TAG, "menu add");
                            case R.id.menu_activity:
                                Log.d(BurppleFoodApp.LOG_TAG, "menu activity");
                            case R.id.menu_person:
                                Log.d(BurppleFoodApp.LOG_TAG, "menu person");
                        }
                        return true;
                    }
                });
    }
}
