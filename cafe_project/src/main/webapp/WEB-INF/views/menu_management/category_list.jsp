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
$(document).ready(function(){ 
	  $("#category_img").click(function(){
		  $("#modal_category_img").attr("src", "/resources/category_img/2.jpg");
	  });
});

$(document).ready(function() {
	$("table").on("click", "tr", function() {
		//클릭이벤트가 발생한 <tr>의 첫번째 <td>자식의 id
		var menu_category_no = $(this).children("td").eq(0).attr('id');
		
		$(location).attr("href","/category_update?menu_category_no="+menu_category_no);
	});
});

</script>


</head>
<body>
<div>
<input type="text" name="category_seatch">&nbsp;<button>등록</button>&nbsp;<button>삭제</button>
<br><br>
<table class="table table-striped table-hover">
<th>체크박스영역</th>
<th>카테고리명</th>
<th>설명</th>
<th>사진</th>
<th>수정</th>
<th>삭제</th>
<c:forEach items="${list }" var="category">
	<tr>
	<td id="${category.menu_category_no}" id="${category.menu_category_no}"></td>
	<td>${category.menu_category_name }</td>
	<td>${category.menu_category_explanation }</td>
	<td><button type="button" data-toggle="modal" data-target="#myModal" id="category_img">사진</button></td>
	<td><button type="button" >수정</button></td>
	<td><button type="button" >삭제</button></td>
	</tr>
</c:forEach>

</table>

 <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
<%--      		<img class="categoryImg" src="${path}1.jpg"> --%>
     		<img class="categoryImg" src="/resources/category_img/1.jpg" id=modal_category_img>

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