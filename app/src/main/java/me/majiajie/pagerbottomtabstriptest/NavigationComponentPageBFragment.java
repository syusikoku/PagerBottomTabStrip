package me.majiajie.pagerbottomtabstriptest;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by mjj on 2018/9/26
 */
public class NavigationComponentPageBFragment extends NavigationComponentPageAFragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTvText.setText("B");
    }
}