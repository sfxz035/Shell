package com.example.shellweather;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.perference_set_activity);
        super.onCreate(savedInstanceState);
        this.getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new FragmentPreferences())
                .commit();
    }
    private static final int menu_setting = 1;

//    @Override
//    protected void onCreate(final Bundle savedInstanceState) {
//        setTheme(R.style.perference_set_activity);
//
//        super.onCreate(savedInstanceState);
//        /**
//         * 创建FragmentManager管理对象，绑定到我们自己设计的PreferenceFragment对象
//         * 再调用commit方法，这时候当前Activity就会显示我们自己设置的Preferences
//         */
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        FragmentPreferences fragmentPreferences = new FragmentPreferences();
//
//        transaction.replace(android.R.id.content, fragmentPreferences);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
}
