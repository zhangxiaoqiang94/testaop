package com.example.testaop.anno;

import javax.annotation.Priority;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnno {
    int id();
    String name();
    CACHE_TYPE cache() default CACHE_TYPE.FIND;

    enum CACHE_TYPE{
        FIND,
        DEL
    }



}
