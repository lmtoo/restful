package cn.accessbright.community.quiz.domain.system;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_sys_func")
public class Func extends Resource {

	private String icon;

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
