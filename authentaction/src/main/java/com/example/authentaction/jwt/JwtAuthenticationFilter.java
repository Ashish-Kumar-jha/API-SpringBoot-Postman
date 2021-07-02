package com.example.authentaction.jwt;

import com.example.authentaction.Service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.CachingUserDetailsService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    CustomerDetailsService customerDetailsService;
    @Autowired
    JwtUtils jwtutil;
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String requestTokenHeader=httpServletRequest.getHeader("Authorization");
        String username=null;
        String jwttoken=null;
        //checking null and format
        if(requestTokenHeader!=null && requestTokenHeader.startsWith("Bearer ")) {
            jwttoken = requestTokenHeader.substring(7);

            try {
                username = this.jwtutil.extractUsername(jwttoken);
            } catch (Exception e) {
                e.printStackTrace();
            }

            UserDetails userDetails = this.customerDetailsService.loadUserByUsername(username);
            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            } else {
                System.out.println("TOKEN IS NOT VALIDATED");
            }
        }
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
