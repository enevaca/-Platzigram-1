package com.platzi.platzigram;

import android.app.Application;
import android.support.annotation.NonNull;
import android.util.Log;

import com.facebook.FacebookSdk;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by enevaca on 23/12/2017.
 */

public class PlatzigramApplication extends Application {

    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    //private FirebaseStorage firebaseStorage;
    private String TAG = "PlatzigramApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        //FirebaseCrash.log("Inicializando variables PlatzigramApplication");

        FacebookSdk.sdkInitialize(getApplicationContext());

        firebaseAuth = FirebaseAuth.getInstance();
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                if (firebaseUser != null){
                    //FirebaseCrash.logcat(Log.WARN, TAG, "Usuario logeado " + firebaseUser.getEmail());
                }else {
                    //FirebaseCrash.logcat(Log.WARN, TAG, "Usuario No logeado ");
                }
            }
        };

        //firebaseStorage = FirebaseStorage.getInstance();
    }


    /*public StorageReference getStorageReference(){
        return firebaseStorage.getReference();
    }*/
}