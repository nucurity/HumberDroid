package com.projects.humberdroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by nucur on 10/23/2016.
 */
public class ContactActivity extends Activity {

    private static final String TAG = "Phase1/Contact";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Dmitry Zuev n01112600");
        setContentView(R.layout.activity_contact);
    }
}
