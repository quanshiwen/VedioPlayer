package com.lwen.application;

import android.app.Application;

/**
 * @Author Lwen
 * @Date 2017/2/28/0028 17:20
 * @Describe 用于程序初始化,初始化一些配置参数
 */

public class LwenApplication extends Application {
    private static LwenApplication mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static LwenApplication getInstence() {
        return mContext;
    }
}
