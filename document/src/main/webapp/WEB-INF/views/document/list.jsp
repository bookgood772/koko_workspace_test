<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../includes/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- document(자료실) 부트스트랩 환경-->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>자료실</title>
    
    <!-- document(자료실) 폴더 경로 체크하기 -->
    <link href="/resources/docjs/jquery.bsPhotoGallery-min.css" rel="stylesheet">
    <script src="/resources/docjs/jquery.bsPhotoGallery-min.js"></script>	
    
    <!-- document(자료실) 목록 정렬 js -->
     <script>
      $(document).ready(function(){
        $('ul.first').bsPhotoGallery({
          "classes" : "col-xl-3 col-lg-2 col-md-4 col-sm-4",
          "hasModal" : true,
          "shortText" : false  
        });
      });
    </script>
</head>
<!-- 배경화면 -->
<style>
      body {
        background:#ebebeb;
      }   
</style>
<body>
<div class="col-sm-9 page">
	<div class="container">
    	<div class="row" style="text-align:center; border-bottom:1px dashed #ccc; padding:30px 0 20px 0; margin-bottom:40px;">
        	<div class="col-lg-12">
            <h3 style="font-weight:bold; font-size:30px;">
            	<a style="text-decoration:none; color:#666;">자료실</a>
            </h3>
            </div>
        </div>	

		<ul class="row first">
			<%-- <c:forEach items="${list}" var="document">
				<li>
					<img alt="Colors" src="http://demo.michaelsoriano.com/images/photodune-460760-colors-xs.jpg"> <!-- 해결해야돼 -->
					<p><c:out value="${document.doc_seq}"/></p><!-- seq -->
					<p><c:out value="${document.doc_file}"/></p><!-- 파일첨부 -->
					<p><c:out value="${document.m_id}"/></p><!-- 이름 -->
					<p><fmt:formatDate pattern="yyyy-MM-dd" value="${document.doc_regdate}"/></p><!-- 작성일 -->			
				</li>
			</c:forEach> --%>
			<c:forEach items="${list}" var="document">
				<li>
					<img alt="Colors" src="http://demo.michaelsoriano.com/images/photodune-460760-colors-xs.jpg"> <!-- 해결해야돼 -->
					<p><c:out value="${document.doc_seq}"/><br>
						   <c:out value="${document.doc_file}"/><br>
						   <c:out value="${document.m_id}"/><br>
						   <fmt:formatDate pattern="yyyy-MM-dd" value="${document.doc_regdate}"/>
					</p>
				</li>
			</c:forEach>
			
		</ul>
		
	</div> <!-- /container -->
</div>
	

	
	<!-- 게시글 등록 후 모달 js -->
	<script type="text/javascript">
		$(document).ready(function(){
			var result = '<c:out value="${result}"/>';
		});
		
		$('#myModal').on('shown.bs.modal', function () {
			  $('#myInput').trigger('focus')
			})
	</script>
</body>
</html>