package com.piske.client_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("client")
public class HelloController {
    private final RestClient restClient;

    public HelloController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping("helo")
    public String hello() {
        return restClient.get()
                .uri("https://localhost:8080/hello")
                .retrieve()
                .body(String.class);
    }
}
