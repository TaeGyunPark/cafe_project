<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 등록</title>


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

#Temperature{
	border: 0.5px solid;
	color: "gray";
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
<form action="/menu_insert" method="post" enctype="multipart/form-data">

<input type="text" placeholder="메뉴명" name="menu_name" id="menu_name"size="10"><br>
<select>
	<c:forEach items="${list }" var="category">
	<option>${category.menu_category_name}</option>
	</c:forEach>
</select><br><br>
<div id="Temperature">
	<p>
	<label>가격 </label><input type="radio" name="menu_Temperature" id="menu_Temperature"> ICE/HOT 별도입력<br>
	<input type="text" placeholder="ICE 입력" id="menu_ice"><br>
	<input type="text" placeholder="HOT 입력" id="menu_hot">
	</p>
</div><br>
<textarea rows="10" cols="50" name="menu_explanation" id="menu_explanation" placeholder="메뉴 설명"></textarea><br>
<input multiple="multiple" type="file" name="category_file" id="category_file"><br>


<button>버튼이지롱</button>
</form>

</div>

</div>


</body>
</html>