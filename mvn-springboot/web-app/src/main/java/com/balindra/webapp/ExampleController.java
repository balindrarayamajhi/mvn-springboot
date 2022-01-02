package com.balindra.webapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping
    public ResponseEntity<Map<String,Object>> getIndex(){
        Map<String, Object> returnVal = new HashMap<>();
        returnVal.put("hello", "world");
        return ResponseEntity.ok(returnVal);
    }
}
