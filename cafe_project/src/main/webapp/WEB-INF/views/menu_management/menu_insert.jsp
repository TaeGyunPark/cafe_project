<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 등록</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.image_view {
	width: 300px;
	margin-top: 50px;
}

.image_view img {
	max-width: 100%;
}

#root {
	width: 100%
}

#image_view {
	width: 50%
}

#category_info {
	width: 50%
}

#Temperature {
	border: 0.5px solid;
	color: "gray";
}
</style>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
<script type="text/javascript">
	var sel_file;

	$(document).ready(function() {
		$("#category_file").on("change", handleImgFileSelect);
	});

	function handleImgFileSelect(e) {
		var files = e.target.files;
		var filesArr = Array.prototype.slice.call(files);

		filesArr.forEach(function(f) {
			if (!f.type.match("image.*")) {
				alert("확장자는 이미지 확장자만 가능합니다");
				return;
			}

			sel_file = f;

			var reader = new FileReader();
			reader.onload = function(e) {
				$("#img").attr("src", e.target.result);
			}
			reader.readAsDataURL(f);
		});
	}

	function checkDisable(frm) {
		if (frm.menu_Temperature.checked == true) {
			frm.menu_ice.disabled = true;
			frm.menu_hot.disabled = true;
		} else {
			frm.menu_ice.disabled = false;
			frm.menu_hot.disabled = false;
		}
	}
</script>

</head>
<body>

	<div id="root">

		<div class="image_view">
			<img id="img" src="/resources/img/xbox.JPG" />
		</div>

		<div id="category_info">
			<form action="/menu_insert" method="post" enctype="multipart/form-data">
				<input type="text" placeholder="메뉴명" name="menu_name" id="menu_name" size="10"><br> 
				<select id="category_select" name="category_select">
					<c:forEach items="${list }" var="category">
						<option value="${category.menu_category_no}">${category.menu_category_name}</option>
					</c:forEach>
				</select><br>
				<br>
				<div id="Temperature">
					<p>
						<label>가격 </label>
						<input type="radio" name="temperature" value="ICE">ICE
						<input type="radio" name="temperature" value="HOT">HOT<br>
						<input type="text" placeholder="가격" id="menu_price" name="menu_price"><br>
					</p>
				</div>
				<br>
				<textarea rows="10" cols="50" name="menu_explanation"
					id="menu_explanation" placeholder="메뉴 설명"></textarea>
				<br> <input type="file" name="menu_file" id="menu_file"><br>
				<button>버튼이지롱</button>
			</form>

		</div>

	</div>


</body>
</html>