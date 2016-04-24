package cn.accessbright.community.quiz.domain.system;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.AbstractAuditable;

@MappedSuperclass
public class Resource extends AbstractAuditable<User, Integer> {
	@NotNull(message = "资源名称不能为空！")
	private String name;

	@ManyToOne
	private Menu parent;

	@NotNull(message = "资源的权限不能为空！")
	private String permission;// 资源的权限

	private String description;

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}