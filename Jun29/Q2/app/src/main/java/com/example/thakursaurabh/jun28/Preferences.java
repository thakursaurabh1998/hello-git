package com.example.thakursaurabh.jun28;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {

    Context context;
    SharedPreferences sharedPreferences;
    private final String username = "username";
    private final String passwor = "password";
    private final String isLogIn = "IsLogin";
    private static Preferences prefrences;

    private Preferences(Context context) {
        this.context =  context;
        sharedPreferences = context.getSharedPreferences("notes",Context.MODE_PRIVATE);
    }


    public static Preferences getInstance(Context context) {
        if(prefrences == null) {
            prefrences = new Preferences(context);
        }
        return prefrences;
    }

    void createUser(String name, String password) {
        sharedPreferences.edit().putString(username,name).apply();
        sharedPreferences.edit().putString(passwor,password).apply();
        sharedPreferences.edit().putBoolean(isLogIn,true).apply();
    }

    String getUserName() {
        return sharedPreferences.getString(username,"");
    }

    boolean isLogin() {
        return  sharedPreferences.getBoolean(isLogIn,false);
    }

    void logOut() {
        sharedPreferences.edit().putBoolean(isLogIn,false).apply();
    }
}