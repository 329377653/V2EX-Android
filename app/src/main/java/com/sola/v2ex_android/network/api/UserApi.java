package com.sola.v2ex_android.network.api;

import java.util.HashMap;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by wei on 2016/10/20.
 */

public interface UserApi {



    @Headers("Referer: https://www.v2ex.com/")
    @GET("my/nodes")      //我收藏的节点
    Observable<String> myCollectNode();

    @GET("signin")      //登录
    Observable<String> loginWithUsername();

    @FormUrlEncoded
    @Headers("Referer: https://www.v2ex.com/signin")
    @POST("signin")
    Observable<String> postLogin(@FieldMap HashMap<String, String> hashMap);

    @GET("my/following")      //我关注的人
    Observable<String> myFollowing();
}
