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
 * @Date 2017/3/1/0001 11:57
 * @Describe ${TODO}
 */

public class MessageFragment extends BaseFragment {
    private de.hdodenhof.circleimageview.CircleImageView messageview;
    private android.widget.TextView                      unreadtipview;
    private android.widget.TextView                      unreadmessageview;
    private android.widget.TextView                      tipmessageview;
    private android.widget.RelativeLayout                messagelayout;
    private de.hdodenhof.circleimageview.CircleImageView zanview;
    private android.widget.TextView                      zantipview;
    private android.widget.TextView                      zanmessageview;
    private android.widget.TextView                      zanmessageinfoview;
    private android.widget.RelativeLayout                zanlayout;
    private de.hdodenhof.circleimageview.CircleImageView imoocview;
    private android.widget.TextView                      tipview;
    private android.widget.TextView                      imoocmessageview;
    private android.widget.TextView                      tipimoocview;
    private android.widget.RelativeLayout                imooclayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return  getLayoutView(inflater, container);
    }

    public View getLayoutView(LayoutInflater inflater, @Nullable ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_message_layout,container,false);
        this.imooclayout = (RelativeLayout) view.findViewById(R.id.imooc_layout);
        this.tipimoocview = (TextView) view.findViewById(R.id.tip_imooc_view);
        this.imoocmessageview = (TextView) view.findViewById(R.id.imooc_message_view);
        this.tipview = (TextView) view.findViewById(R.id.tip_view);
        this.imoocview = (CircleImageView) view.findViewById(R.id.imooc_view);
        this.zanlayout = (RelativeLayout) view.findViewById(R.id.zan_layout);
        this.zanmessageinfoview = (TextView) view.findViewById(R.id.zan_message_info_view);
        this.zanmessageview = (TextView) view.findViewById(R.id.zan_message_view);
        this.zantipview = (TextView) view.findViewById(R.id.zan_tip_view);
        this.zanview = (CircleImageView) view.findViewById(R.id.zan_view);
        this.messagelayout = (RelativeLayout) view.findViewById(R.id.message_layout);
        this.tipmessageview = (TextView) view.findViewById(R.id.tip_message_view);
        this.unreadmessageview = (TextView) view.findViewById(R.id.unread_message_view);
        this.unreadtipview = (TextView) view.findViewById(R.id.unread_tip_view);
        this.messageview = (CircleImageView) view.findViewById(R.id.message_view);
        return view;
    }
}
