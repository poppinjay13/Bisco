package com.example.mpesalibrary;
import android.support.annotation.NonNull;

public interface DarajaListener<Result>
{
  void onResult(@NonNull Result result);
  void onError(String error);
}
