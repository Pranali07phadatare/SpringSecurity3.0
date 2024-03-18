package com.neosoft.domain;


import lombok.Builder;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JwtResponse {

    private String username;
    private String jwtToken;

    private String password;


}
