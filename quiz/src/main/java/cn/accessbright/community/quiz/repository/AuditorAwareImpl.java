package cn.accessbright.community.quiz.repository;

import cn.accessbright.community.quiz.domain.system.SystemUserHolder;
import cn.accessbright.community.quiz.domain.system.User;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;


@Component
public class AuditorAwareImpl implements AuditorAware<User> {
	@Override
	public User getCurrentAuditor() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || !authentication.isAuthenticated()) {
			return null;
		}
		return ((SystemUserHolder) authentication.getPrincipal()).getSystemUser();
	}
}