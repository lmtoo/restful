package cn.accessbright.community.quiz.repository;

import java.util.List;
import java.util.UUID;

import cn.accessbright.community.quiz.domain.system.Role;
import cn.accessbright.community.quiz.domain.system.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User>,UserRepositoryCustom {
	/**
	 * 根据凭证查找用户，凭证包括用户名、邮箱、电话
	 * 
	 * @param credential
	 * @return
	 */
	@Query("select u from User u where u.username=:credential or u.email=:credential or u.phone=:credential")
	User findByCredential(@Param("credential") String credential);

	User findByUsername(String username);

	@Query("select u.roles from User u where u.username=:username")
	@EntityGraph(attributePaths = "roles.permissions", type = EntityGraphType.FETCH)
	List<Role> findRolesByUsername(String username);

	User findByActiveCode(String activeCode);

	/**
	 * 查找所有的内部用户
	 *
	 * @return
	 */
	List<User> findByInternalTrue();
}