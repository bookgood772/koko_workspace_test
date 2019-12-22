package rt.koko.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DocumentPage {
	private int pageNum; // 페이지 번호
	private int amount; // 한 페이지당 보여줄 게시글 갯수
	
	public DocumentPage() {
		this(1, 12);
	}
	
	public DocumentPage(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	
}
