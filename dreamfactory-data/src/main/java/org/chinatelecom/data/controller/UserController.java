package org.chinatelecom.data.controller;

import org.chinatelecom.data.entity.User;
import org.chinatelecom.data.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author :WQ
 * @Description:
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    @GetMapping
    public Integer checkUser(String str){

        return userService.checkUser(str);
    }

    @PostMapping("register/{name}")
    public Integer register(@PathVariable String name){
        User user = new User();
        user.setName(name);

        return userService.register(user);
    }



}
