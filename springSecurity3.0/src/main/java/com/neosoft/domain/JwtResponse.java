package com.neosoft.domain;


import lombok.Builder;

@Builder
public class JwtResponse {

    private String username;
    private String jwtToken;

    private String password;


}
