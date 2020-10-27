package com.hipravin.braintrain.gateway.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    @GetMapping(path = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> ping() {
        return ResponseEntity.ok("{\"status\": \"up\"}");
    }
}
