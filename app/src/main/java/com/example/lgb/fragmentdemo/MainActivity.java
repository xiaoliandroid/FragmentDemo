package com.example.lgb.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    private static int mflagfragment = 0;
    private Button bt;
    private FrameLayout frameLayout;
    private Fragment[] fragments;
    private FragmentManager fManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewByID();
        initView();
    }

    @Override
    protected void onResumeFragments() {
        Log.d(TAG, "omResumeFragments");
        super.onResumeFragments();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart");
        super.onStart();
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        Log.d(TAG, "startActivityForResult");
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void onAttachFragment(android.support.v4.app.Fragment fragment) {
        Log.d(TAG, "onAttachFragment");
        super.onAttachFragment(fragment);
    }

    @Override
    public void startActivity(Intent intent) {
        Log.d(TAG, "startActivity");
        super.startActivity(intent);
    }

    @Override
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode) {
        Log.d(TAG, "startActivityFromFragment");
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    // 初始化视图
    private void initView() {
        fragments = new Fragment[2];
        fragments[0] = new Fragment1();
        fragments[1] = new Fragment2();
        fManager = getFragmentManager();
        FragmentTransaction transition = fManager.beginTransaction();
        transition.add(R.id.fram, fragments[0], "fragment1").hide(fragments[0]);
        transition.addToBackStack("fragment1");
        transition.add(R.id.fram, fragments[1], "fragment2").hide(fragments[1]);
         transition.addToBackStack("fragment2");
        transition.show(fragments[0]);
        Log.d(TAG,"5454654645654656");
        transition.commit();
        bt.setOnClickListener(new MyClickChange());
    }

    //id
    private void findViewByID() {
        bt = (Button) findViewById(R.id.bt1);
        frameLayout = (FrameLayout) findViewById(R.id.fram);
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop");
        super.onStop();
    }

    @Override
    protected void onPostResume() {
        Log.d(TAG, "onPostResume");
        super.onPostResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume");
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void startActivityFromFragment(android.support.v4.app.Fragment fragment, Intent intent, int requestCode) {
        Log.d(TAG, "startActivityFromFargment");
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart");
        super.onRestart();
    }

    private class MyClickChange implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            switch (mflagfragment) {
                case 0:
                    fManager.beginTransaction().hide(fragments[mflagfragment]).show(fragments[++mflagfragment]).commit();
                    break;
                case 1:
                    fManager.beginTransaction().hide(fragments[mflagfragment]).show(fragments[0]).commit();
                    mflagfragment = 0;
                    break;
            }

        }
    }
}
