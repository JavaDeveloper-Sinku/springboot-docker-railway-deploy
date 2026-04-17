package com.deployPlatform.health.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public Map<String, Object> health(){
        Map<String, Object> response = new HashMap<>();

        response.put("status", "UP");
        response.put("timestamp", Instant.now().toString());

        return response;


    }
}
