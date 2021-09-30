package com.example.demo.filter;

import org.springframework.stereotype.Component;
import javax.servlet.*;
import java.io.IOException;

@Component
public class MyFilter_1 implements Filter {
    @Override
     public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain ) throws ServletException, IOException {
        System.out.println("Filter is called");
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
