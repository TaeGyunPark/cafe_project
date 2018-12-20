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
	$("#modal_menu_img").attr("src", "/resources/menu_img/"+img);
};

</script>


</head>
<body>
<div>
<input type="text" name="name">&nbsp;<button onclick='location.href="/menu_insert";'>등록</button>&nbsp;<button>삭제</button>
<br><br>
<table class="table table-striped table-hover">
<th>체크박스영역</th>
<th>메뉴명</th>
<th>카테고리</th>
<th>ICE/HOT</th>
<th>가격</th>
<th>설명</th>
<th>사진</th>
<th>수정</th>
<th>삭제</th>
<c:forEach items="${list }" var="menu">
	<tr>
	<td><input type="checkbox"></td>
	<td>${menu.menu_name }</td>
	<td>${menu.menu_category_no }</td>
	<td>${menu.menu_temperature }</td>
	<td>${menu.menu_price }</td>
	<td>${menu.menu_explanation }</td>
	<td><button type="button" data-toggle="modal" data-target="#myModal" id="${menu.menu_name }" onclick="find_id('${menu.menu_image_stored_name}')">사진</button></td>
	<td><button type="button" onclick='location.href="/category_update?category_no=${menu.menu_no }";'>수정</button></td>
	<td><button type="button" onclick='location.href="/category_delete?category_no=${menu.menu_no }";'>삭제</button></td>
	</tr>
</c:forEach>

</table>
<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
<%--      		<img class="categoryImg" src="${path}1.jpg"> --%>
     		<img class="menuImg" id=modal_menu_img src="#">

        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>

    
  </div>


</div>
</body>
</html>