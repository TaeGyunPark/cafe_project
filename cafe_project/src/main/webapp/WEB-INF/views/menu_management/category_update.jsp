<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리 등록</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">

.image_view{
	width: 300px;
	margin-top: 50px;
}
.image_view img{
	max-width: 100%;
}

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

<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
<script type="text/javascript">
	var sel_file;
	
	
	
	$(document).ready(function(){
		$("#category_file").on("change", handleImgFileSelect);
	});
	
	function handleImgFileSelect(e) {
		var files = e.target.files;
		var filesArr = Array.prototype.slice.call(files);
		
		filesArr.forEach(function(f) {
			if(!f.type.match("image.*")) {
				alert("확장자는 이미지 확장자만 가능합니다");
				return;
			}
			
			sel_file = f;
			
			var reader = new FileReader();
			reader.onload = function(e) {
				$("#img").attr("src",e.target.result);
			}
			reader.readAsDataURL(f);
		});
	}

</script>

</head>
<body>

<div id="root">

<div class="image_view">
	<img id="img" src="/resources/img/xbox.JPG"/>
</div>

<div id="category_info">
<form action="/category_update" method="post" enctype="multipart/form-data">

<input type="text" placeholder="카테고리명" name="category_name" id="category_name"size="10" value="${cafe_menu_category.menu_category_name}"><br>
<textarea rows="10" cols="50" name="category_explanation" id="category_explanation" placeholder="카테고리 설명">${cafe_menu_category.menu_category_explanation}</textarea><br>
<input type="file" name="category_file" id="category_file" value="${cafe_menu_category.menu_category_no}"><br>
<input type="hidden" name="category_no" id="category_no" value="${cafe_menu_category.menu_category_no}">

<button>버튼이지롱</button>
</form>

</div>

</div>


</body>
</html>