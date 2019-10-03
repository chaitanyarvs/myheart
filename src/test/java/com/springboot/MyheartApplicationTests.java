package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.springboot.repo.MyHeartRepo;

@RunWith(SpringRunner.class)
@WebMvcTest
public class MyheartApplicationTests {
	
	@Autowired
	MockMvc mockMvc; // to use direct rest calls

	@MockBean
	MyHeartRepo MHRepo;

	@Test
	public void contextLoads() {
	}

}
