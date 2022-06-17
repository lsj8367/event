package com.github.ls8367.controller;

import com.github.ls8367.application.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/")
    public ResponseEntity<?> memberSave() {
        demoService.saveMember();
        return ResponseEntity.ok().build();
    }

}
