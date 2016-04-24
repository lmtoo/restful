package cn.accessbright.community.quiz.service;

import org.springframework.context.ApplicationEvent;

public class RegisterEvent extends ApplicationEvent {

	public RegisterEvent(Object source) {
		super(source);
	}

}
