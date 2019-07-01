package com.example.testaop.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.testaop.anno.UserAnno;
import com.example.testaop.anno.UserTest;
import com.example.testaop.pojo.User;
import com.example.testaop.service.UserService;
import com.example.testaop.util.UtilGson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;




    @RequestMapping("/a")
    @UserAnno(id = 1,name = "aa")
    public  String a(){
        return "a";
    }

    @RequestMapping("/b")
    @UserAnno(id = 2,name = "22")
    public  String b(){
        return  "b";
    }


    @UserTest(id = 1)
    @RequestMapping("/c")
    public String c(){

        return "c";
    }

    @RequestMapping("/findAll")
    @UserAnno(id = 5,name = "ss")
    public String d(Integer i){

        return "findall   id";

    }


    @RequestMapping("/find")
    public List<User> find(){
      List<User> user= userService.findAll();

      String u= UtilGson.toJson(user);
        System.out.println("user 转换为  json  =="+u);
      //  User us=(User) UtilGson.toObject(u,User.class);

      //  System.out.println("工具json  转化object  "+us);

      return user;

    }









}
