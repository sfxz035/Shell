package com.example.shellweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by DELL on 2019/4/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
