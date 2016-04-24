package cn.accessbright.community.quiz.repository;

import java.util.List;

import cn.accessbright.community.quiz.domain.questions.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface ImageRepository extends JpaRepository<Image, Integer> {

	List<Image> findTop10ByOrderByNameDesc();
}
