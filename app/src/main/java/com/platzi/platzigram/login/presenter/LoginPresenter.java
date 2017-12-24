package com.platzi.platzigram.login.presenter;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by enevaca on 23/12/2017.
 */


public interface LoginPresenter {
    void signIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth); // Interactor
    void loginSuccess();
    void loginError(String error);


}