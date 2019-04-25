package com.example.mpesalibrary.okhttp;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AuthInterceptor {
 private String authToken;

 public AuthInterceptor(String authToken){
     this.authToken =authToken;
 }
  public Response intercept(@NonNull Interceptor.Chain chain) throws IOException{
      Request request = chain.request().newBuilder()
              .addHeader("Authorization","Bearer" +authToken)
              .build();
      return chain.proceed(request);

  }

}
