package com.rsa.newwebservicetest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("webservice.php")
    Call<LoginPojo> putLogin(@Field("module") String module, @Field("uname") String uname, @Field("app_version") String app_version, @Field("os") String os);
}
