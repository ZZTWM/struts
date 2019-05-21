<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		<form action="addProduct" method="post">
			产品名称：<input type="text" name="product.name"><br>
			产品保质期限：<input type="text" name="product.age"><br>
			<input type="submit" value="submit">
		</form>
	 -->
	
	<!-- 使用struts标签库 -->
	<s:form action="addProduct">
		<s:textfield name="product.name" label="product name" />
		<s:submit value="Submit"/>
	</s:form>
	
</body>
</html>