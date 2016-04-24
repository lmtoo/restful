package cn.accessbright.community.quiz.repository;

import cn.accessbright.community.quiz.domain.system.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface RoleRepository extends JpaRepository<Role, Integer> {

}
