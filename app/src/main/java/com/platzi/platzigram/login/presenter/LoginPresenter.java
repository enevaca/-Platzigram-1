package com.platzi.platzigram.login.presenter;

/**
 * Created by enevaca on 23/12/2017.
 */

public interface LoginPresenter {
    void signIn(String username, String password); //Interactor
    void loginSuccess();
    void loginError(String error);
}
