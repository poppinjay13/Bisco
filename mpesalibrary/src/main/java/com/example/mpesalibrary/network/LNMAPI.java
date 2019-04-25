package com.example.mpesalibrary.network;

import com.example.mpesalibrary.model.LNMExpress;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LNMAPI {

    @POST("mpesa/stkpush/v1/processrequest")
    Call<LNMExpress> getLNMPesa(@Body LNMExpress lnmExpress);

}
