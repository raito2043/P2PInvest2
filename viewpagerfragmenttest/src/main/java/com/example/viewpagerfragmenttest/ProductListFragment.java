package com.example.viewpagerfragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static com.example.viewpagerfragmenttest.R.layout.product_list_fragment;


/**
 * Created by Raito on 2017/10/3.
 * invest子Fragment全部产品
 */

public class ProductListFragment extends Fragment {
    public ProductListFragment() {
    }

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private LayoutInflater mInflater;
    private List<String> mTitleList = new ArrayList<>();//页卡标题集合
    private View view1, view2, view3, view4, view5;//页卡视图
    private List<View> mViewList = new ArrayList<>();//页卡视图集合


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.product_list_fragment, container, false);





       /* mInflater = LayoutInflater.from(getContext());
        view1 = mInflater.inflate(R.layout.activity_main, null);
        view2 = mInflater.inflate(R.layout.activity_main, null);
        view3 = mInflater.inflate(R.layout.activity_main, null);
        view4 = mInflater.inflate(R.layout.activity_main, null);
        view5 = mInflater.inflate(R.layout.activity_main, null);*/

//        //添加页卡视图
//        mViewList.add(view1);
//        mViewList.add(view2);
//        mViewList.add(view3);
//        mViewList.add(view4);
//        mViewList.add(view5);

//        //添加页卡标题
//        mTitleList.add("No:1");
//        mTitleList.add("No:2");
//        mTitleList.add("No:3");
//        mTitleList.add("No:4");
//        mTitleList.add("No:5");


//        mTabLayout.setTabMode(TabLayout.MODE_FIXED);//设置tab模式，当前为系统默认模式
//        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(0)));//添加tab选项卡
//        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(1)));
//        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(2)));
//        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(3)));
//        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(4)));


//        MyPagerAdapter mAdapter = new MyPagerAdapter(mViewList);
//        mViewPager.setAdapter(mAdapter);//给ViewPager设置适配器
//        mTabLayout.setupWithViewPager(mViewPager);//将TabLayout和ViewPager关联起来。
//        mTabLayout.setTabsFromPagerAdapter(mAdapter);//给Tabs设置适配器

        return view;
    }

    /*//ViewPager适配器
    class MyPagerAdapter extends PagerAdapter {
        private List<View> mViewList;

        public MyPagerAdapter(List<View> mViewList) {
            this.mViewList = mViewList;
        }

        @Override
        public int getCount() {
            return mViewList.size();//页卡数
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;//官方推荐写法
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(mViewList.get(position));//添加页卡
            return mViewList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(mViewList.get(position));//删除页卡
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitleList.get(position);//页卡标题
        }


    }*/
}
