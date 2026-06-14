<%@page import="com.model.student1"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student Information</h1>
<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Age</th>
</tr>
<%
List<student1> s=(List<student1>)request.getAttribute("stu");
if(!s.isEmpty()){
	for(student1 st:s){
		%>
		<tr>
		<td><%=st.getId() %></td>
		<td><%=st.getName() %></td>
		<td><%=st.getAge() %></td>		
		</tr>
    <%
	}
}else{
%>
	 <h1>Student Data Not  Found</h1>
	 <%
} 
	 %>

</table>
</body>
</html>