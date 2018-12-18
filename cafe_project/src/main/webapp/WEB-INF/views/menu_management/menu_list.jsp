<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">

function find_id(name) {
	var img = name;
	$("#modal_category_img").attr("src", "/resources/category_img/"+img);
};

</script>


</head>
<body>
<div>
<input type="text" name="category_seatch">&nbsp;<button onclick='location.href="/category_insert";'>등록</button>&nbsp;<button>삭제</button>
<br><br>
<table class="table table-striped table-hover">
<th>체크박스영역</th>
<th>메뉴명</th>
<th>카테고리</th>
<th>ICE/HOT</th>
<th>가격</th>
<th>사진</th>
<th>수정</th>
<th>삭제</th>
<%-- <c:forEach items="${list }" var="category"> --%>
	<tr>
	<td><input type="checkbox"></td>
	<td>아이스아메리카노</td>
	<td>커피</td>
	<td>ICE</td>
	<td>3000</td>
	<td><button type="button" data-toggle="modal" data-target="#myModal" id="${category.menu_category_img_stored_name }" onclick="find_id('${category.menu_category_img_stored_name}')">사진</button></td>
	<td><button type="button" onclick='location.href="/category_update?category_no=${category.menu_category_no }";'>수정</button></td>
	<td><button type="button" onclick='location.href="/category_delete?category_no=${category.menu_category_no }";'>삭제</button></td>
	</tr>
<%-- </c:forEach> --%>

</table>

</div>
</body>
</html>