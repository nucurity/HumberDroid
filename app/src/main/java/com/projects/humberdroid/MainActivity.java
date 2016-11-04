package com.projects.humberdroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.util.Locale;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Phase1/Main";

    View btnCourses;
    View btnAbout;
    View btnContact;
    View btnExit;
    RadioButton rbEnglish;
    RadioButton rbFrench;
    RadioGroup rgLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i (TAG, "Dmitry Zuev n01112600");
        setContentView(R.layout.activity_main);

        btnCourses = findViewById(R.id.btn_courses);
        btnAbout = findViewById(R.id.btn_about);
        btnContact = findViewById(R.id.btn_contact);
        btnExit = findViewById(R.id.btn_exit);
        rgLang = (RadioGroup) findViewById(R.id.rg_language);
        rbEnglish = (RadioButton) findViewById(R.id.rb_english);
        rbFrench = (RadioButton) findViewById(R.id.rb_french);


        btnExit.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnContact.setOnClickListener(this);
        btnCourses.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view.getId() == btnExit.getId()){
            System.exit(1);
        } else if(view.getId() == btnContact.getId()){
            Intent intent = new Intent(this, ContactActivity.class);
            this.startActivity(intent);
        }else if(view.getId() == btnAbout.getId()){
            Intent intent = new Intent(this, AboutActivity.class);
            this.startActivity(intent);
        }else if(view.getId() == btnCourses.getId()) {
            Intent intent = new Intent(this, CoursesListActivity.class);
            switch (rgLang.getCheckedRadioButtonId()) {
                case R.id.rb_french:
                    intent.putExtra("lang", "fr");
                    break;
                case R.id.rb_english:
                    intent.putExtra("lang", "en");
                    break;
                default:
                    intent.putExtra("lang", getResources().getConfiguration().locale.getLanguage());
                    break;
            }
            this.startActivity(intent);
        }
    }


}
