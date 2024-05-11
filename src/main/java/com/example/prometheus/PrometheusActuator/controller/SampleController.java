package com.example.prometheus.PrometheusActuator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(path = "/hello")
    public ResponseEntity hello(){
        return ResponseEntity.ok("Hello Ravi");
    }
}
