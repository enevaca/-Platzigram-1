package com.platzi.platzigram.login.interactor;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by enevaca on 23/12/2017.
 */

public interface LoginInteractor {
    void signIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth);
}
