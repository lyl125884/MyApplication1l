package com.speed.ndkdemo;


import android.util.Log;

public class Jni {
    static {
        System.loadLibrary("SpeedSDK");
    }

//    public static native int speed();
    public  native void  getString(OnErrorListener jni);
//    public native void callbackThread();




//    public void getCurResponseRate( String msg)
//    {
////        return msg;
//            Log.e("msg", "getCurResponseRate:" + msg);
//    }

//    private OnErrorListener onErrorListener;
//
//    public void setOnErrorListener(OnErrorListener onErrorListener) {
//        this.onErrorListener = onErrorListener;
//    }
//
//    //Jni调用此方法，把结果返回到java层
//    public void onError(int code, String msg)
//    {
//        if(onErrorListener != null)
//        {
//            onErrorListener.getCurResponseRate(code, msg);
//        }
//    }
//
    public interface OnErrorListener
    {
        void getCurResponseRate(int code, String msg);
    }

}
