package rt.koko.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
									   "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class DocumentControllerTests {
	@Setter(onMethod_ = {@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
//	@Test
//	public void testList() throws Exception {
//		log.info(
//				mockMvc.perform(MockMvcRequestBuilders.get("/document/list"))
//				.andReturn()
//				.getModelAndView()
//				.getModelMap());
//	}
	
//	@Test
//	public void testInsert() throws Exception {
//		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/document/insert")
//				.param("doc_title", "테스트 컨트롤러 제목")
//				.param("doc_content", "테스트 컨트롤러 내용")
//				.param("doc_file", "테스트 컨트롤러 파일")
//				.param("m_id", "aaa")
//				).andReturn().getModelAndView().getViewName();
//		
//		log.info(resultPage);
//	}
	
//	@Test
//	public void testDetail() throws Exception {
//		log.info(mockMvc.perform(MockMvcRequestBuilders
//				.get("/document/detail")
//				.param("doc_seq", "146"))
//				.andReturn()
//				.getModelAndView().getModelMap());
//	}
	
//	@Test
//	public void testUpdate() throws Exception {
//		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/document/update")
//				.param("doc_seq", "146")
//				.param("doc_title", "수정!!!!!제목!!!")
//				.param("doc_content", "수정!!!!!내용")
//				.param("doc_file", "수정!!!!")
//				.param("m_id", "aaa"))
//				.andReturn().getModelAndView().getViewName();
//		
//		log.info(resultPage);
//	}
	
//	@Test
//	public void testDelete() throws Exception {
//		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/document/delete")
//				.param("doc_seq", "147"))
//				.andReturn().getModelAndView().getViewName();
//		
//		log.info(resultPage);
//	}
	
	@Test
	public void testListPaging() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/document/list")
				.param("pageNum", "2")
				.param("amount", "50"))
				.andReturn().getModelAndView().getModelMap());
	}
	
	

}
