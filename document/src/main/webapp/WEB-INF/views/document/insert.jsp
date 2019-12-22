<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
            	<a style="text-decoration:none; color:#666;">글등록</a>
            </h3>
            </div>
        </div>
        
        <form action="/document/insert" method="post">
			제목: <input type="text" name="doc_title"><br>
			<!-- 첨부파일: <input type="file" name="doc_file"><br> -->
			첨부파일: <input type="text" name="doc_file"><br>
			작성자: <input type="text" name="m_id"><br>
			내용 <br>
				<textarea rows="10" cols="70" name="doc_content"></textarea>
				<br>
			<input type="submit" value="등록">
			<input type="reset" value="다시입력">
		</form>
        </div>

</body>
</html>