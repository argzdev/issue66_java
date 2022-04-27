package com.argz.issue66_java;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setApplicationId("1:1059489949573:android:acb1c9741a054a6d4fc6ec") // Required for Analytics.
//                .setApiKey(apiKey) // Required for Auth.
                .build();
        FirebaseApp.initializeApp(getBaseContext(), options);
    }
}
