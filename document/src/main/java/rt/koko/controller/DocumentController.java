package rt.koko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import rt.koko.domain.DocumentPage;
import rt.koko.domain.DocumentVO;
import rt.koko.service.DocumentService;

@Controller
@Log4j
@RequestMapping("/document/*")
@AllArgsConstructor
public class DocumentController {
	private DocumentService service;
	
	// 목록
//	@GetMapping("/list")
//	public void documentList(Model model) {
//		log.info("list");
//		model.addAttribute("list", service.documentList());
//	}
	//목록 + 페이징 처리
	@GetMapping("/list")
	public void documentList(DocumentPage docPage, Model model) {
		log.info("list 컨트롤러 : " + docPage);
		model.addAttribute("list", service.documentList(docPage));
	}
	
	//등록1 - 등록 작업은 post 방식으로 처리
	@RequestMapping(value="/insert" , method = {RequestMethod.POST})
	public String documentInsert(DocumentVO document, RedirectAttributes rttr) {
		log.info("insert 컨트롤러: " + document);
		
		service.documentInsert(document);
		rttr.addFlashAttribute("result", document.getDoc_seq());
		
		return "redirect:/document/list";
	}
	//등록2 - 화면에서 입력 받을때 get방식으로 입력 페이지 볼 수 있게 한다.(입력 페이지를 보여주는 역할만
	@GetMapping("/insert")
	public void documentInsert() {}
	
	//조회 - 수정,삭제 페이지로 이동
	@GetMapping({"/detail", "/update"})
	public void documentDetail(@RequestParam("doc_seq") Long doc_seq, Model model) {
		log.info("/detail 이거나 /update 이거나");
		
		model.addAttribute("document", service.documentDetail(doc_seq));
	}
	
	//수정
	@PostMapping("/update")
	public String documentUpdate(DocumentVO document, RedirectAttributes rttr) {
		log.info("update 컨트롤러: " + document);
		
		if(service.documentUpdate(document)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/document/list";
	}
	
	//삭제
	@PostMapping("/delete")
	public String documentDelete(@RequestParam("doc_seq") Long doc_seq, RedirectAttributes rttr) {
		log.info("delete 컨트롤러: " + doc_seq);
		
		if(service.documentDelete(doc_seq)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/document/list";
	}
	
	

}
