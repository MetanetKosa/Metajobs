package org.recruit.post.mapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@Log4j
public class PostControllerTest {
	
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mvc;
	
	@Before
	public void setup() {
		this.mvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void postList() throws Exception {
		log.info(mvc.perform(MockMvcRequestBuilders.get("/post/postList"))
				.andReturn()
				.getModelAndView()
				.getModelMap());
	}
	
}
