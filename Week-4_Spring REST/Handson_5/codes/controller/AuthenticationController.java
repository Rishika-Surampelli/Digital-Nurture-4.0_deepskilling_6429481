package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("Start");
        LOGGER.debug("AuthHeader: {}", authHeader);

        String user = getUser(authHeader);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("End");
        return map;
    }

    private String getUser(String authHeader) {
        String encodedCredentials = authHeader.replace("Basic ", "");
        byte[] decoded = Base64.getDecoder().decode(encodedCredentials);
        String decodedStr = new String(decoded);
        return decodedStr.split(":")[0];
    }

    private String generateJwt(String user) {
        io.jsonwebtoken.JwtBuilder builder = io.jsonwebtoken.Jwts.builder();
        builder.setSubject(user);
        builder.setIssuedAt(new java.util.Date());
        builder.setExpiration(new java.util.Date((new java.util.Date()).getTime() + 1200000)); // 20 minutes
        builder.signWith(io.jsonwebtoken.SignatureAlgorithm.HS256, "secretkey");
        return builder.compact();
    }
}
