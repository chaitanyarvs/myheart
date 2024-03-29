package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.entity.MyHeart;
import com.springboot.repo.MyHeartRepo;

@RestController
public class MyHeartController {
	
	@Autowired
	private MyHeartRepo myHeartRepo;
	
	 @RequestMapping(value="/myheart", method=RequestMethod.GET, headers="Accept=application/json")

	    public List<MyHeart> getAllHeartRates() {
	        return myHeartRepo.findAll();
	    }

}
