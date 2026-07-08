package com.cognizant.spring_security_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.Date;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final SecretKey SECRET_KEY =
            Keys.hmacShaKeyFor(
                    "mysecretkeymysecretkeymysecretkey12"
                            .getBytes(StandardCharsets.UTF_8));

    private String generateJwt(String user) {

        return Jwts.builder()
                .subject(user)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(SECRET_KEY)
                .compact();
    }

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        System.out.println("Authorization Header : " + authHeader);
        String user = getUser(authHeader);
        System.out.println("Logged in User : " + user);

        Map<String, String> map = new HashMap<>();

        String token = generateJwt(user);
        System.out.println("Generated Token : " + token);
        map.put("token", token);

        return map;
    }

    private String getUser(String authHeader) {

        // Remove "Basic "
        String encodedCredentials = authHeader.substring(6);

        // Decode Base64
        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String decodedString =
                new String(decodedBytes, StandardCharsets.UTF_8);

        // decodedString = user:pwd
        return decodedString.split(":")[0];
    }
}