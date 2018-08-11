package com.dummy.java.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dummy.java.springboot.topic.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(new Topic("spring","springcourse","desript"));
	}

}
