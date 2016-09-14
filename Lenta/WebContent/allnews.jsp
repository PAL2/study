<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show all news</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>News ID</th>
				<th>Name</th>
				<th>Annotation</th>
				<th>Author Id</th>
				<th>Date</th>
				<th>Text</th>
				<th>Category</th>
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allNews}" var="news">
				<tr>
					<td><c:out value="${news.newsId}" /></td>
					<td><c:out value="${news.name}" /></td>
					<td><c:out value="${news.annotation}" /></td>
					<td><c:out value="${news.authorId}" /></td>
					<td><c:out value="${news.date}" /></td>
					<td><c:out value="${news.text}" /></td>
					<td><c:out value="${news.categoryId}" /></td>
					<td><a
						href="Controller?action=edit&id=<c:out value="${news.newsId }"/>">Update</a></td>
					<td><a
						href="Controller?action=delete&id=<c:out value="${news.newsId }"/>">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p>
		<a href="Controller?action=insert">Add User</a>
	</p>
</body>
</html>