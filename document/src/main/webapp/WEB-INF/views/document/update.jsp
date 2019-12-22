<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row" style="text-align:center; border-bottom:1px dashed #ccc; padding:30px 0 20px 0; margin-bottom:40px;">
        	<div class="col-lg-12">
            <h3 style="font-weight:bold; font-size:30px;">
            	<a style="text-decoration:none; color:#666;">글조회</a>
            </h3>
            </div>
        </div>
			게시글: <input name="doc_seq" value='<c:out value="${document.doc_seq}"/>' readonly="readonly"><br>
			제목: <input name="doc_title" value='<c:out value="${document.doc_title}"/>'><br>
			첨부파일: <input name="doc_file" value='<c:out value="${document.doc_file}"/>'><br>
			작성자: <input name="m_id" value='<c:out value="${document.m_id}"/>' readonly="readonly"><br>
			내용 <br>
				<textarea rows="10" cols="70" name="doc_content"><c:out value="${document.doc_content}"/></textarea>
				<br>
				
			<!-- <button type="submit" data-oper='update' class="btn btn-defalut">수정</button>
			<button type="submit" data-oper='delete' class="btn btn-defalut">삭제</button>
			<button type="submit" data-oper='list' class="btn btn-defalut">목록</button> -->
        </div>
	
	
	<!-- js -->
	<!-- <script type="text/javascript">
		$(document).ready(function() {
			var formObj = ${"form"};
			$('button').on("click", function(e) {
				e.preventDefault();
				var operation = $(this).data("oper");
				
				console.log(operation);
				
				if(operation === 'delete') {
					formObj.attr("action", "/document/delete");
				} else if(operation === 'list') {
					//페이지 이동
					self.location="/document/list";
					return;
				}
				formObj.submit();				
			});	
		});
	</script> -->
</body>
</html>