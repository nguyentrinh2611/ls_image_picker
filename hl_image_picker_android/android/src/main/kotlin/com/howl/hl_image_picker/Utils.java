package com.howl.hl_image_picker;

import static android.content.Context.MODE_PRIVATE;

import android.app.Activity;
import android.content.SharedPreferences;

public class Utils {
    public static String getUriPath(Activity activity){
        SharedPreferences prefs = activity.getSharedPreferences("stage", MODE_PRIVATE);
        return prefs.getString("path", "");
    }

    public static void setUriPath(Activity activity, String path){
        SharedPreferences.Editor editor = activity.getSharedPreferences("stage", MODE_PRIVATE).edit();
        editor.putString("path", path);
        editor.apply();
    }
}