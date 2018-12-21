package com.tatman.gtsimpleservice.controllers;

import com.tatman.gtsimpleservice.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public Iterable<User> getUsers() {

        List<User> users = new ArrayList<>();

        users.add(new User("Ali", "Baba"));
        users.add(new User("Ali", "Dede"));

        return users;
    }

}
