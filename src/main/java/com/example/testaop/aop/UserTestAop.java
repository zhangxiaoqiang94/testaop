package com.example.testaop.aop;

import com.example.testaop.anno.UserTest;
import org.apache.jute.Index;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserTestAop {

    @Around("@annotation(userTest)")
    public Object around(ProceedingJoinPoint joinPoint, UserTest userTest)throws Throwable{
        Object c=null;
        if(userTest.id()==2){

            c="第二个切面注解类测试";
        }else {
            c=joinPoint.proceed();

        }
        System.out.println(c);
        return c;
    }













}
