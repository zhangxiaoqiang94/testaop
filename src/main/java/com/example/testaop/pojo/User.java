package com.example.testaop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private int id;
    private String name;
    private int age;
    private String sex;




}
