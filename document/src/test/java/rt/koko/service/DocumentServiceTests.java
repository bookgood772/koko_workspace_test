package rt.koko.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import rt.koko.domain.DocumentPage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DocumentServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private DocumentService service;

//	@Test
//	public void testExist() {
//		log.info(service);
//		assertNotNull(service);
//	}

//	@Test
//	public void testInsert() {
//		DocumentVO document = new DocumentVO();
//		document.setDoc_title("service 제목");
//		document.setDoc_content("service 내용");
//		document.setDoc_file("service 파일");
//		document.setM_id("aaa");
//		
//		service.documentInsert(document);
//		
//		log.info("생성된 게시물의 번호: " + document.getDoc_seq());
//	}
	
//	@Test
//	public void testList() {
//		service.documentList().forEach(document -> log.info(document));
//	}
	
//	@Test
//	public void testDetail() {
//		log.info(service.documentDetail(143L));
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("documentDelete 서비스 결과: " + service.documentDelete(114L)); // t||f
//	}
	
//	@Test
//	public void testUpdate() {
//		DocumentVO document = service.documentDetail(113L);
//		
//		if(document == null) {
//			return;
//		}
//		
//		document.setDoc_title("신사임당임당");
//		log.info("documentUpdate 서비스 결과: " + service.documentUpdate(document));
//	}
	
	@Test
	public void testList2() {
		service.documentList(new DocumentPage(2, 10)).forEach(document -> log.info(document));
	}
}
