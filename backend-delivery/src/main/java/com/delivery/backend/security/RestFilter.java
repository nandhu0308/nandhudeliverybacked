package com.delivery.backend.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delivery.backend.services.UserService;

/**
 * @author Ram K Bharathi
 * @created May 4, 2017
 */
public class RestFilter implements Filter {

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		String authTokenFromHeader = servletRequest.getHeader("Authorization");
		System.out.println("token : " + authTokenFromHeader);
		String path = servletRequest.getRequestURI().substring(servletRequest.getContextPath().length());
		System.out.println("path : " + path);
		boolean authStatus = false;
		
		if(path.contains("login")){
			authStatus = true;
		}
		else{
			if(authTokenFromHeader != null){
				UserService service = new UserService();
				authStatus = service.userAuthenticate(authTokenFromHeader);
			}
		}
		
		if(authStatus){
			chain.doFilter(request, response);
		}
		else{
			if(response instanceof HttpServletResponse){
				HttpServletResponse servletResponse = (HttpServletResponse) response;
				servletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Authentication Failed");
			}
		}
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
