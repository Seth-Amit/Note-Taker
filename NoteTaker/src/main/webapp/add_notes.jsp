<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navBar.jsp"%>

		<h1>Please fill your Note detail</h1>
		<br>
		<form action="abc" method="post">
			<div class="form-group">
				<label for="title">Note Title</label> <input name="title" required
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter here" />

			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea name="content" required style="height: 300px;"
					class="form-control" id="content"
					placeholder="Enter your content here"></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Add</button>
			</div>

		</form>
	</div>
</body>
</html>