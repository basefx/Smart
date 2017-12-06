package com.dovgopolyy.smartfamily;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Yevgen Dovgopolyy (basefx) on 11/30/17.
 */

public interface API {

    @Headers("Cache-Control: max-age=640000")
    @POST
    Call<String> init();
}
