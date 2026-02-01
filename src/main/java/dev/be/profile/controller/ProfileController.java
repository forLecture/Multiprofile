package dev.be.profile.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.be.profile.config.AppProperties;
import dev.be.profile.config.AppProperties2;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProfileController {

    private final AppProperties appProperties;
    private final AppProperties2 appProperties2;

    @GetMapping("/profile")
    public Map<String, Object> getProfile() {
        Map<String, Object> info = new HashMap<>();
        info.put("name", appProperties2.getName());
        info.put("version", appProperties2.getVersion());
        info.put("message", appProperties2.getMessage());
        info.put("databaseUrl", appProperties2.getDatabaseUrl());
        return info;
    }
}
