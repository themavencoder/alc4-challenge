package com.themavencoder.alc4phase1;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by themavencoder on 13,July,2019
 */
public class WebAppInterface {
    Context mContext;


    WebAppInterface(Context c) {
        mContext = c;
    }


    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
}
