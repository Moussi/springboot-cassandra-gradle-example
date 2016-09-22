package com.ioteam.utils;

import com.google.gson.Gson;

/**
 * Created by moussiaymen on 06/12/15.
 */
public class JsonUtils {

    public static String toJson(Object object){
        Gson gson = new Gson();
        return gson.toJson(object);
    }

 /*   public static void main(String[] args) {
        Greeting g = new Greeting();
        g.setCreationDate(new Date());
        g.setGreet("thank you");
        g.setUser("moussi");
        g.setId(UUIDs.timeBased());
        System.out.println(JsonUtils.toJson(g));
    }*/

}
