<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리 등록</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<style type="text/css">

#root{
	width: 100%
}

#image_view{
width: 50%
}

#category_info{
width: 50%
}
</style>

</head>
<body>

<div id="root">

<div id="image_view">
</div>

<div id="category_info">
<form action="/category_insert" method="post" enctype="multipart/form-data">

<input type="text" placeholder="카테고리명" name="category_name" id="category_name"size="10"><br>
<textarea rows="10" cols="50" name="category_content" id="category_content" placeholder="카테고리 설명"></textarea><br>
<input type="file" name="category_file" id="category_file"><br>


<button>버튼이지롱</button>
</form>

</div>

</div>


</body>
</html>