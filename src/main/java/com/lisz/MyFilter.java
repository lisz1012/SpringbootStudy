package com.lisz;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Order(1)
@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init ... ");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//if (((HttpServletRequest)request).getSession().getAttribute("name") == null) return;
		System.out.println("Filter ... ");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("destroy ... ");
	}
}
