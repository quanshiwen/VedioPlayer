package com.lwen.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lwen.R;
import com.lwen.activity.base.BaseActivity;
import com.lwen.view.fragment.CommonFragment;
import com.lwen.view.fragment.HomeFragment;
import com.lwen.view.fragment.MessageFragment;
import com.lwen.view.fragment.MineFragment;

/**
 * @Author Lwen
 * @Date 2017/2/28/0028 17:24
 * @Describe ${TODO}
 */

public class HomeActivity extends BaseActivity implements ViewGroup.OnClickListener {
    private RelativeLayout  contentlayout;
    private TextView        homeimageview;
    private RelativeLayout  homelayoutview;
    private TextView        fishimageview;
    private RelativeLayout  pondlayoutview;
    private TextView        messageimageview;
    private RelativeLayout  messagelayoutview;
    private TextView        mineimageview;
    private RelativeLayout  minelayoutview;
    private LinearLayout    linearLayout;
    private FragmentManager fragmentManager;
    private HomeFragment    homeFragment;
    private MessageFragment messageFragment;
    private MineFragment    mineFragment;
    private CommonFragment commonFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);

        initView();
        homeFragment = new HomeFragment();
       // messageFragment = new MessageFragment();
       // mineFragment = new MineFragment();
      //  commonFragment = new CommonFragment();

        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_layout, homeFragment);
        fragmentTransaction.commit();
    }

    private void initView() {
        this.linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        this.contentlayout = (RelativeLayout) findViewById(R.id.content_layout);

        this.minelayoutview = (RelativeLayout) findViewById(R.id.mine_layout_view);
        this.mineimageview = (TextView) findViewById(R.id.mine_image_view);

        this.messagelayoutview = (RelativeLayout) findViewById(R.id.message_layout_view);
        this.messageimageview = (TextView) findViewById(R.id.message_image_view);

        this.pondlayoutview = (RelativeLayout) findViewById(R.id.pond_layout_view);
        this.fishimageview = (TextView) findViewById(R.id.fish_image_view);

        this.homelayoutview = (RelativeLayout) findViewById(R.id.home_layout_view);
        this.homeimageview = (TextView) findViewById(R.id.home_image_view);
        homeimageview.setBackgroundResource(R.drawable.comui_tab_home_selected);


        minelayoutview.setOnClickListener(this);
        messagelayoutview.setOnClickListener(this);
        homelayoutview.setOnClickListener(this);
        pondlayoutview.setOnClickListener(this);
    }

    /**
     * 隐藏Fragment
     * @param fragment
     * @param fragmentTransaction
     */
    private void hideFragment(Fragment fragment, FragmentTransaction fragmentTransaction) {
        if (fragment != null) {
            fragmentTransaction.hide(fragment);
        }
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.home_layout_view:
                homeimageview.setBackgroundResource(R.drawable.comui_tab_home_selected);
                mineimageview.setBackgroundResource(R.drawable.comui_tab_person);
                messageimageview.setBackgroundResource(R.drawable.comui_tab_message);
                fishimageview.setBackgroundResource(R.drawable.comui_tab_pond);

                hideFragment(mineFragment,fragmentTransaction);
                hideFragment(messageFragment,fragmentTransaction);
                hideFragment(commonFragment,fragmentTransaction);
                if (homeFragment != null) {
                    fragmentTransaction.show(homeFragment);
                } else {
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.content_layout, homeFragment);
                }
                break;
            case R.id.message_layout_view:
                messageimageview.setBackgroundResource(R.drawable.comui_tab_message_selected);
                mineimageview.setBackgroundResource(R.drawable.comui_tab_person);
                fishimageview.setBackgroundResource(R.drawable.comui_tab_pond);
                homeimageview.setBackgroundResource(R.drawable.comui_tab_home);

                hideFragment(mineFragment,fragmentTransaction);
                hideFragment(homeFragment,fragmentTransaction);
                hideFragment(commonFragment,fragmentTransaction);
                if (messageFragment != null) {
                    fragmentTransaction.show(messageFragment);
                } else {
                    messageFragment = new MessageFragment();
                    fragmentTransaction.add(R.id.content_layout, messageFragment);
                }
                break;
            case R.id.mine_layout_view:
                mineimageview.setBackgroundResource(R.drawable.comui_tab_person_selected);
                messageimageview.setBackgroundResource(R.drawable.comui_tab_message);
                fishimageview.setBackgroundResource(R.drawable.comui_tab_pond);
                homeimageview.setBackgroundResource(R.drawable.comui_tab_home);

                hideFragment(messageFragment,fragmentTransaction);
                hideFragment(homeFragment,fragmentTransaction);
                hideFragment(commonFragment,fragmentTransaction);
                if (mineFragment != null) {
                    fragmentTransaction.show(mineFragment);
                } else {
                    mineFragment = new MineFragment();
                    fragmentTransaction.add(R.id.content_layout, mineFragment);
                }
                break;
            case R.id.pond_layout_view:
                fishimageview.setBackgroundResource(R.drawable.comui_tab_pond_selected);
                mineimageview.setBackgroundResource(R.drawable.comui_tab_person);
                messageimageview.setBackgroundResource(R.drawable.comui_tab_message);
                homeimageview.setBackgroundResource(R.drawable.comui_tab_home);

                hideFragment(messageFragment,fragmentTransaction);
                hideFragment(homeFragment,fragmentTransaction);
                hideFragment(mineFragment,fragmentTransaction);
                if (commonFragment != null) {
                    fragmentTransaction.show(commonFragment);
                } else {
                    commonFragment = new CommonFragment();
                    fragmentTransaction.add(R.id.content_layout, commonFragment);
                }
                break;
        }
        fragmentTransaction.commit();
    }
}
