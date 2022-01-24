package com.infurapoc.controller;

import com.infurapoc.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/setUserDetails/{userName}/{age}")
    @ApiOperation(value = "This API use to call the Contract")
    public String setUserDetails(@PathVariable String userName, @PathVariable String age) throws Exception {
        return userService.setUserDetails(userName,Integer.valueOf(age));

    }



}



