package cn.accessbright.community.quiz.web.controller;

import java.util.List;

import cn.accessbright.community.quiz.domain.questions.Image;
import cn.accessbright.community.quiz.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/images")
public class ImageController {
	@Autowired
	private ImageRepository repository;
	
	
	@RequestMapping("/index")
	public List<Image> images(){
		return repository.findTop10ByOrderByNameDesc();
	}
	
	@RequestMapping("/create")
	public Image create(){
		Image image=new Image();
		image.setName("123");
		image.setUrl("http://www.baidu.com");
		return repository.save(image);
	}
}
