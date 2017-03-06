package com.lwen.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.lwen.R;
import com.lwen.view.fragment.home.BaseFragment;

/**
 * @Author Lwen
 * @Date 2017/3/1/0001 11:50
 * @Describe ${TODO}
 */

public class HomeFragment extends BaseFragment {

    private android.widget.TextView qrcodeview;
    private android.widget.TextView  categoryview;
    private android.widget.TextView  searchview;
    private android.widget.ImageView loadingview;
    private android.widget.ListView  listview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return  getLayoutView(inflater, container);
    }

    private View getLayoutView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_home_layout,container,false);
        this.listview = (ListView) view.findViewById(R.id.list_view);
        this.loadingview = (ImageView) view.findViewById(R.id.loading_view);
        this.searchview = (TextView) view.findViewById(R.id.search_view);
        this.categoryview = (TextView) view.findViewById(R.id.category_view);
        this.qrcodeview = (TextView) view.findViewById(R.id.qrcode_view);
        return view;
    }
}
