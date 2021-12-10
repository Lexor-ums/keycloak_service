package com.example.keycloak.controller;

import com.example.keycloak.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class SampleController {
    private final UsersService usersService;


    @PostMapping("/data")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<?> getAminInfo() {
        return ResponseEntity.ok("Hello from another service");
    }


}
