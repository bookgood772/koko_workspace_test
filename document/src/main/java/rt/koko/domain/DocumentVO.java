package rt.koko.domain;

import java.util.Date;

import lombok.Data;

@Data
public class DocumentVO {
	private Long doc_seq;
	private String doc_title;
	private String doc_content;
	private String doc_file;
	private Date doc_regdate;
	private String m_id;
}
