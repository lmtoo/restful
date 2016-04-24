package cn.accessbright.community.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class ApplicationService {

	@Autowired
	protected ApplicationEventPublisher eventPublisher;

}
