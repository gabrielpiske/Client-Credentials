package com.piske.resource_server.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping()
    public String hello(@AuthenticationPrincipal Jwt jwt) {
        return "Ola Mundo!\n" + jwt.getTokenValue();
    }
}
