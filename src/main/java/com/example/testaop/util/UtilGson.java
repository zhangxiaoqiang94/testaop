package com.example.testaop.util;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

public class UtilGson {

    private static Gson gson=new Gson();
    //工具类方法  把对象转化为json
    public static String toJson(Object key){
        String result= null;
        try {
            result = gson.toJson(key);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("转换json失败");
        }
        return  result;
    }

    //工具类方法  把对象转化为object对象
    public static Object toObject(String key,Class<Object> target){
       // T t=null;
        Object t=null;
        try {
            t =  gson.fromJson(key,target);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException("类型转换失败");
        }
        return t;
    }


}
