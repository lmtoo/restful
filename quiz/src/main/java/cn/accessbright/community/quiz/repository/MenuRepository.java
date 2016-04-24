package cn.accessbright.community.quiz.repository;

import cn.accessbright.community.quiz.domain.system.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MenuRepository extends JpaRepository<Menu, Integer> {

    List<Menu> findByParentId(String parentId);

    // 查找一级菜单
    List<Menu> findByParentIsNull();
}
