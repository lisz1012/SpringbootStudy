package com.lisz.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener {
	public static int online = 0;

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("创建Session");
		online ++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("销毁Session");
		online --;
	}
}
