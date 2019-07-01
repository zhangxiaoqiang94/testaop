package com.example.testaop.aop;

import com.example.testaop.anno.UserAnno;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAOP {

  @Around("@annotation(userAnno)")
  public Object pointcut(ProceedingJoinPoint joinPoint, UserAnno userAnno) throws Throwable {
      Object re=null;
     if(userAnno.id()==1){
       re=joinPoint.proceed();
       System.out.println(re);
     }else {
         Object[] requsult=joinPoint.getArgs();
         re=requsult.toString();
      // re="aop02";
       System.out.println(re);
     }
   return re;

  }








}
