package com.jcesarmobile.appcenter;

import org.apache.cordova.CordovaPlugin;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class AppCenterPlugin extends CordovaPlugin {

    @Override
    protected void pluginInitialize() {
        String secret = preferences.getString("AppCenterSecret", "");
        AppCenter.start(this.cordova.getActivity().getApplication(), secret,
                Analytics.class, Crashes.class);
    }

}