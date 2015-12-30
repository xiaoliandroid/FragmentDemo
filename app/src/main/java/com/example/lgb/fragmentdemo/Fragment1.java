package com.example.lgb.fragmentdemo;/*  
 * 文件名
 * 包含类名列表
 * 版本信息，版本号
 * 创建日期
 * 版权声明
 */
//3.0一下不兼容
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.transition.Transition;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {
    private static String TAG = "Fragment1";
    public Fragment1() {
        super();
    }

    /*
    * 是否隐藏
    * fragment用hide方式切换的情况下
    * 用此方法来存储数据或者其他功能*/
    @Override
    public void onHiddenChanged(boolean hidden) {
        Log.d(TAG,"onHiddenChanged");
        super.onHiddenChanged(hidden);

    }

    /*
    * 跳转activity
    * 传入参数为intent*/
    @Override
    public void startActivity(Intent intent) {
        Log.d(TAG,"startActivity");
        super.startActivity(intent);
    }

    /*带返回数据返回activity
    *传入数据后调用startActivityfromFragment
    *但看源码中startActivityFromFragment并没有对options做任何处理，执行的还是startActivity方法.
    * */
    @Override
    public void startActivity(Intent intent, Bundle options) {
        Log.d(TAG,"startActivity");
        super.startActivity(intent, options);
    }

    /*
    * 启动的是startActivityForResult
    * 都是继承的mhost（callback）*/
    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        Log.d(TAG,"startActivityForResult");
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG,"onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.d(TAG,"onViewCreated");
        super.onViewCreated(view, savedInstanceState);

    }
/*
* 获取视图*/
    @Nullable
    @Override
    public View getView() {
        return super.getView();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d(TAG,"onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG,"onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG,"onResume");
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.d(TAG,"onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    /*配置改变时调用*/
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.d(TAG,"onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onPause() {
        Log.d(TAG,"onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG,"onStop");
        super.onStop();
    }

    @Override
    public void onLowMemory() {
        Log.d(TAG,"onLoWMemory");
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        Log.d(TAG,"onTrimMemory");
        super.onTrimMemory(level);
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG,"onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG,"onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG,"onDetach");
        super.onDetach();
    }
/*以下都是跟transition相关的方法*/

    @Override
    public boolean getAllowReturnTransitionOverlap() {
        return super.getAllowReturnTransitionOverlap();
    }

    @Override
    public void setAllowReturnTransitionOverlap(boolean allow) {
        super.setAllowReturnTransitionOverlap(allow);
    }

    @Override
    public boolean getAllowEnterTransitionOverlap() {
        return super.getAllowEnterTransitionOverlap();
    }

    @Override
    public void setAllowEnterTransitionOverlap(boolean allow) {
        super.setAllowEnterTransitionOverlap(allow);
    }

    @Override
    public Transition getSharedElementReturnTransition() {
        return super.getSharedElementReturnTransition();
    }

    @Override
    public void setSharedElementReturnTransition(Transition transition) {
        super.setSharedElementReturnTransition(transition);
    }

    @Override
    public Transition getSharedElementEnterTransition() {
        return super.getSharedElementEnterTransition();
    }

    @Override
    public void setSharedElementEnterTransition(Transition transition) {
        super.setSharedElementEnterTransition(transition);
    }

    @Override
    public Transition getReenterTransition() {
        return super.getReenterTransition();
    }

    @Override
    public void setReenterTransition(Transition transition) {
        super.setReenterTransition(transition);
    }

    @Override
    public Transition getExitTransition() {
        return super.getExitTransition();
    }

    @Override
    public void setExitTransition(Transition transition) {
        super.setExitTransition(transition);
    }

    @Override
    public Transition getReturnTransition() {
        return super.getReturnTransition();
    }

    @Override
    public void setReturnTransition(Transition transition) {
        super.setReturnTransition(transition);
    }

    @Override
    public Transition getEnterTransition() {
        return super.getEnterTransition();
    }

    @Override
    public void setEnterTransition(Transition transition) {
        super.setEnterTransition(transition);
    }
}
