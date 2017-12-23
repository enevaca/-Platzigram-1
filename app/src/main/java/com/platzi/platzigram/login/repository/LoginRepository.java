package com.platzi.platzigram.login.repository;

/**
 * Created by enevaca on 23/12/2017.
 */

public interface LoginRepository {
    void signIn(String username, String password);
}
