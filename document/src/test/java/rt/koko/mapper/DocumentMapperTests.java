package rt.koko.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import rt.koko.domain.DocumentPage;
import rt.koko.domain.DocumentVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DocumentMapperTests {
	@Setter(onMethod_ = @Autowired)
	private DocumentMapper mapper;
	
//	@Test
//	public void testList(){
//		mapper.documentList().forEach(document -> log.info(document));
//	}
	
//	@Test
//	public void testInsert() {
//		DocumentVO document = new DocumentVO();
//		document.setDoc_title("제목 테스트 중");
//		document.setDoc_content("내용 테스트 중");
//		document.setDoc_file("파일 테스트 중");
//		document.setM_id("aaa");
//		
//		mapper.documentInsert(document);
//		
//		log.info(document);
//	}
	
//	@Test
//	public void testInsertSelectKey() {
//		DocumentVO document = new DocumentVO();
//		document.setDoc_title("제목 테스트 중 -> select key test");
//		document.setDoc_content("내용 테스트 중 -> select key test");
//		document.setDoc_file("파일 테스트 중 -> select key test");
//		document.setM_id("aaa");
//		
//		mapper.documentInsertSelectKey(document);
//		
//		log.info(document);
//	}
	
//	@Test
//	public void testDetail() {
//		DocumentVO document = mapper.documentDetail(142L);
//		log.info(document);
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("DELETE COMPLITE!!!!!!!!(삭제된 갯수) : " + mapper.documentDelete(142L));
//	}
	
//	@Test
//	public void testUpdate() {
////		Long targetDno = 81L;
////		DocumentVO document = mapper.documentDetail(targetDno);
//		DocumentVO document = new DocumentVO();
//		document.setDoc_seq(120L);
//		document.setDoc_title("aaa수정aa");
//		document.setDoc_content("a수정bbbbbb");
//		document.setDoc_file("ddddd수정ddd");
//		document.setM_id("aaa");
//		
//		int count = mapper.documentUpdate(document);
//		
//		log.info("UPDATE COMPLITE!!!!!!!(수정된 게시글 갯수) : " + count);
//	}
	
	@Test
	public void testPaging() {
		DocumentPage docPage = new DocumentPage();
		
		//10개씩 3페이지
		docPage.setPageNum(3);
		docPage.setAmount(9);
		
		List<DocumentVO> list = mapper.documentListPaging(docPage);
		list.forEach(document -> log.info(docPage));
	}
}
