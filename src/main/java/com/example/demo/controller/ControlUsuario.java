package com.example.demo.controller;

import com.example.demo.model.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ControlUsuario
 */
@RestController
@RequestMapping("/usuario")
public class ControlUsuario {

    @RequestMapping("/cadastroUsuario")
    public ResponseEntity<User> cadastroUsuario() {

        User user = new User();

        user.setNome("Led");
        user.setEmail("ledmail");
        user.setId(1l);
        user.setAddres("addres");

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    
}