<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	.imgs_wrap {
		width: 300px;
		margin-top: 50px;
	}
	.imgs_wrap img{
		max-width: 200px;
	}
</style>

<!-- jQuery 2.2.4 -->
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>

<script type="text/javascript">
	var sel_files = [];
	$(document).ready(function() {
		$("#imput_imgs").on("change", handleImagsFilesSelect);
	});
	
	function handleImgsFilesSelect(e){
		var files =e.target.files;
		var filesArr = Array.prototype.slice.call(files);
	
		filesArr.forEach(function(f) {
			if(!f.type.match("image.*")){
				alert("확장자는 이미지 확장자만 가능합니다");
				return;
			}
			
			sel_files.push(f);
			
			var reader = new FileReader();
			reader.onload = function(e){
				var img_html = "<img src=\"" + e.target.result + "\" />";
				$(".imgs_wrap").append(img_html);
			}
			reader.readAsDataURL(f);
		});
	}

</script>

</head>
<body>
	<div>
		<p class="title">다중 이미지 업로드</p>
		
	</div>
</body>
</html>