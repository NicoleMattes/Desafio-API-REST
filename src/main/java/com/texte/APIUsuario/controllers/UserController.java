package com.texte.APIUsuario.controllers;

import java.util.List;
import com.texte.APIUsuario.entities.User;
import com.texte.APIUsuario.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable long id){
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public User Insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }
}
