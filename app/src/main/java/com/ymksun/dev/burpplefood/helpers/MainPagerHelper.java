package com.ymksun.dev.burpplefood.helpers;

import android.os.Handler;
import android.support.v4.view.ViewPager;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yemyokyaw on 1/11/18.
 */

public class MainPagerHelper {

    private static int currentPage = 0;
    private static Timer timer;
    private static final long DELAY_MS = 3000;//delay in milliseconds before task is to be executed
    private static final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.

    private static ViewPager mViewPager;

    public static void autoScrollPager(ViewPager viewPager, int count) {

        mViewPager = viewPager;
        final int viewCount = count;

        /*After setting the adapter use the timer */
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == viewCount) {
                    currentPage = 0;
                }
                mViewPager.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer(); // This will create a new Thread
        timer .schedule(new TimerTask() { // task to be scheduled

            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);
    }
}
