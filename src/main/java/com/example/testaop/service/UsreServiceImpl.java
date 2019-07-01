package com.example.testaop.service;

import com.example.testaop.mapper.UserMapper;
import com.example.testaop.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsreServiceImpl implements  UserService {
    @Autowired
    private UserMapper userMapper;



    @Override
    public List<User> findAll() {
        List<User> user=userMapper.selectList(null);
        return user;
    }
}
