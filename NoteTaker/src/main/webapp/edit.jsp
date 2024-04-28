<%@page import="jakarta.servlet.RequestDispatcher"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.helper.*"%>
<%@page import="org.hibernate.*"%>
<%@page import="com.entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all_js_css.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<%@include file="navBar.jsp"%>
		<h1>This is Edit Page</h1>
		<%
		int note_id=Integer.parseInt(request.getParameter("note_id").trim());
		Session s=FactoryProvider.getFactory().openSession();
		Note note=(Note)s.get(Note.class, note_id);

		%>
		<form action="update" method="post">
		<input value="<%=note.getId() %>"name="noteId" type="hidden"/>
		
			<div class="form-group">
				<label for="title">Note Title</label> <input name="title" required
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter here" 
					value="<%=note.getTitle() %>"
					
					/>

			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea name="content" required style="height: 300px;"
					class="form-control" id="content"
					placeholder="Enter your content here"><%=note.getContnt() %></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-success">Save your note</button>
			</div>

		</form>
	</div>
</body>
</html>