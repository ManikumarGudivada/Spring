<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>

<form action="/Login.do" method="post">
	<div>
		<table>
			<thead>
				<tr>
					<th>
					<label>First Name</label>
					<input name="FirstName" type="text" value="abc"></input>
					</th>
					<th>
					<label>Last Name</label>
					<input name="LastName" type="text"></input>
					</th>
					<th>
					<label>Company</label>
					<input name="Company" type="text"></input>
					</th>
					<th>
					<label>Place</label>
					<input name="Place" type="text"></input>
					</th>
					
				</tr>
				<th>
				<input type='submit' value='ADD'>
				</th>
				
				</tr>
			</thead>
			<tbody>
			<tr>
				
			</tr>
			</tbody>
		</table>
		<%-- <c:forEach items="name" var="d"> 
			<h1>${firstname}</h1>
		</c:forEach> --%>
	</div>
	
	
	
</form>
<form action="/Login.do" method="get">
		
		
		<c:forEach items="${name}" var="d"> 
			<c:out value="${d}.[0]"><br></c:out>
		</c:forEach>
	</form>
</body>
</html>
