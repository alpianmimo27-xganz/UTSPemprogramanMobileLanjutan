package com.alpianmimo.uts182101939.service;

import com.alpianmimo.uts182101939.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}