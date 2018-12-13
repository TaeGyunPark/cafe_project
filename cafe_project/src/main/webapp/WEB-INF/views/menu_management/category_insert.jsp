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