<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Badr  JSP</title>
</head>
<body>
<%
  String nom=request.getParameter("nom");
%>
<ul>
<li>nom:<% out.println(nom); %></li>
<li>IP client:<%=request.getRemoteAddr()%></li>
<li>Protocole:<%=request.getProtocol()%></li>
</ul>

</body>
</html>