package com.lwen.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lwen.R;
import com.lwen.view.fragment.home.BaseFragment;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * @Author Lwen
 * @Date 2017/3/1/0001 11:58
 * @Describe ${TODO}
 */

public class MineFragment extends BaseFragment {
    private de.hdodenhof.circleimageview.CircleImageView photoview;
    private android.widget.TextView                      logininfoview;
    private android.widget.TextView                      loginview;
    private android.widget.RelativeLayout                loginlayout;
    private de.hdodenhof.circleimageview.CircleImageView userphotoview;
    private android.widget.TextView                      usernameview;
    private android.widget.TextView                      tickview;
    private android.widget.RelativeLayout                loginedlayout;
    private android.widget.TextView                      videosettingview;
    private android.widget.TextView                      shareimoocview;
    private android.widget.TextView                      myqrcodeview;
    private android.widget.TextView                      updateview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return  getLayoutView(inflater, container);
    }

    private View getLayoutView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_mine_layout,container,false);
        this.updateview = (TextView) view.findViewById(R.id.update_view);
        this.myqrcodeview = (TextView) view.findViewById(R.id.my_qrcode_view);
        this.shareimoocview = (TextView) view.findViewById(R.id.share_imooc_view);
        this.videosettingview = (TextView) view.findViewById(R.id.video_setting_view);
        this.loginedlayout = (RelativeLayout) view.findViewById(R.id.logined_layout);
        this.tickview = (TextView) view.findViewById(R.id.tick_view);
        this.usernameview = (TextView) view.findViewById(R.id.username_view);
        this.userphotoview = (CircleImageView) view.findViewById(R.id.user_photo_view);
        this.loginlayout = (RelativeLayout) view.findViewById(R.id.login_layout);
        this.loginview = (TextView) view.findViewById(R.id.login_view);
        this.logininfoview = (TextView) view.findViewById(R.id.login_info_view);
        this.photoview = (CircleImageView) view.findViewById(R.id.photo_view);
        return view;
    }
}
