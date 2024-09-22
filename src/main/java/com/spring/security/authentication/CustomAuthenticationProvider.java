package com.spring.security.authentication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * packageName    : com.spring.security.authentication
 * fileName       : AuthenticationProvider
 * author         : Administrator
 * date           : 2024-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-20        Administrator       최초 생성
 */
@Slf4j
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

//        UserDetails userDetails = userDetailsService.loadUserByUsername(username);

//        if(!passwordEncoder.matches(password, userDetails.getPassword())) {
//            throw new BadCredentialsException("BadCredentialsException");
//        }

//        return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
