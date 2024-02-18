package com.newmemo.newmemo.controller;

import com.newmemo.newmemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private UserService userService;
}
