<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container"><!-- div 시작 : 발주처 리스트 페이지 전체 -->
<h3 align="left">재고관리&nbsp;&gt;&nbsp;발주처</h3>

<div><!-- div 시작 : 목록 위에 버튼들-->
<div style="float: right; padding:10px;"><!-- div 시작 : 검색-->
	<select id="searchType" name="searchType" style="height: 25px;">
		<option value="all" <c:out value="${paging.searchType eq 'all' ? 'selected' : '' }"/>>[전체]</option>
		<option value="name" <c:out value="${paging.searchType eq 'name' ? 'selected' : '' }" />>발주처명</option>
		<option value="manager" <c:out value="${paging.searchType eq 'manager' ? 'selected' : '' }" />>담당자명</option>
		<option value="phone" <c:out value="${paging.searchType eq 'phone' ? 'selected' : '' }" />>연락처</option>
	</select>
	<input type="text" id="keyword" name="keyword" value="${paging.keyword }" placeholder="검색어를 입력하세요"/>
	<button id="btnSearch" class="btn btn-xs">검색</button>
	<a href="/owner/stock/manage/orderingdepartment/write">
		<button class="btn btn-xs">등록</button>
	</a>
</div><!-- div 끝 : 목록 위에 버튼들-->

<table class="table table-hover table-condense">
	<thead>
		<tr>
			<th width="20%">발주처명</th>
			<th width="30%">주소</th>
			<th width="10%">담당자</th>
			<th width="10%">연락처</th>
			<th width="15%">등록일</th>
			<th width="5%">비고</th>
			<th width="5%">수정</th>
			<th width="5%">삭제</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="list" items="${oDeptList }">
			<tr>
				<td>${list.ordering_department_name }</td>
				<td>${list.ordering_department_address }</td>
				<td>${list.ordering_department_manager }</td>
				<td>${list.ordering_department_phone }</td>
				<td><fmt:formatDate value="${list.ordering_department_date }" pattern="yyyy-MM-dd KK:mm:ss"/></td>
				<td><a href="/owner/stock/manage/orderingdepartment/remarks?ordering_department_no=${list.ordering_department_no }">
					<button class="btn btn-xs">비고</button></a>
				</td>
				<td><a href="/owner/stock/manage/orderingdepartment/update?ordering_department_no=${list.ordering_department_no }">
				<button class="btn btn-xs">수정</button></a></td>
				<td><a><button class="btn btn-xs">삭제</button></a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>


</div><!-- div 끝 : 발주처 리스트 목록 -->



</div><!-- div 끝 : 발주처 리스트 페이지 전체 -->

</body>
</html>