package com.rani.Config;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtValidator extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
      
        String jwt = request.getHeader(jwtConstant.JWT_HEADER);

    }
    if(jwt == null || !jwt.startsWith("Bearer ")){
        try{
            SecurityKey securityKey = new SecurityKey(jwtConstant.SECRET_KEY);
        }
        filterChain.doFilter(request, response);
        return;
    }



}
