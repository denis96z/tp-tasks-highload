package ru.mail.park.samplewebapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> getMessage() throws InterruptedException {
        Thread.sleep(500);
        return ResponseEntity.ok("Hello world!");
    }
}
