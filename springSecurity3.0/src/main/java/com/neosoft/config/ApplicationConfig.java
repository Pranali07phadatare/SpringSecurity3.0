package com.neosoft.config;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {


//  private final UserRepository repository;
//
//  @Bean
//  public UserDetailsService userDetailsService() {
//    return username -> repository.findByEmail(username)
//        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//  }

//  @Bean
//  public AuthenticationProvider authenticationProvider() {
//    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//    authProvider.setUserDetailsService(userDetailsService());
//    authProvider.setPasswordEncoder(passwordEncoder());
//    return authProvider;
//  }

//  @Bean
//  public AuditorAware<Integer> auditorAware() {
//    return new ApplicationAuditAware();
//  }


  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

}
