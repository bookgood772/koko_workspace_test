<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */

    
    /* 사이드바 */
    .sidenav {
      background-color: #f1f1f1;
      position: fixed;
      width: 200px;
      height: 100%;
      margin-left: -20px;
      margin-top:50px
    }
    /* 본문  */
    .page {
     margin-top:50px;
     margin-left: 250px;
    }

    
    /* footer */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    #content {
    	height: 80%;
    }
</style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">KOKO</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

<div class="container-fluid">

     <!-- 사이드바 -->
    <nav class="col-sm-3 sidenav">
      <ul class="nav nav-pills nav-stacked" >
        <li class="active"><a href="#">Home</a></li>
        <li><a href="/Chat/kokoChat">채팅</a></li>
        <li><a href="#section3">Family</a></li>
        <li><a href="#section3">Photos</a></li>
      </ul>
    </nav>
   <!-- 사이드바 끝 -->

 
</div>

<!-- footer -->
<footer class="container-fluid navbar-fixed-bottom">
  <p>Footer</p>
</footer>
<!-- footer 끝 -->

</body>

</html>