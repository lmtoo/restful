package cn.accessbright.community.quiz.web.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session has bean created..................................");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("session has ben destroyed...............................");
	}
}
