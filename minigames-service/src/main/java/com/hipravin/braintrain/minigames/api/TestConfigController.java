package com.hipravin.braintrain.minigames.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestConfigController {

    @Value("${minigames.testprop:defaultprop}")
    String testProp;

    @GetMapping("/testprop")
    public ResponseEntity<?> testConfigProperty() {
        return ResponseEntity.ok("prop:" + testProp);
    }
}
