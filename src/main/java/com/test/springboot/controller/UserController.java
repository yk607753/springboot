package com.test.springboot.controller;

import com.test.springboot.entity.User;
import com.test.springboot.repository.UserRepository;
import com.test.springboot.webservice.HttpClientUtil;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.test.springboot.webservice.HttpClientUtil.getConnection;
import static com.test.springboot.webservice.HttpClientUtil.getRequestMethod;

@RestController
public class UserController {

    @Autowired
    private UserRepository us;
    @Autowired
    private User user;

    @RequestMapping(value = "/selectAllUser", method = RequestMethod.GET)
    public List<User> selectAllUser(){

        return us.findAll();

    }


    @PostMapping(value = "/addUser")
    public User addUser(@RequestParam("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("sex") char sex,
                           @RequestParam("age") Integer age,
                           @RequestParam("address") String address){
        user.setId(id);
        user.setName(name);
        user.setSex(sex);
        user.setAge(age);
        user.setAddress(address);

        return us.save(user);
    }

    @PostMapping(value = "/select")
    public User SelectUser(@RequestParam("id") Integer id){

        return us.findOne(id);

    }

    @PostMapping(value = "/delete")
    public void DeleteUser (@RequestParam("id") Integer id){

        us.delete(id);

    }
    @PostMapping(value = "/jk")
    public String ser(){

        return null;

    }

}
