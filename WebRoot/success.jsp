<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>OGNL表达式的使用</title>
  <h1>${name}</h1><hr>
  获取action属性：<s:property value="name"/><br>
  获取session属性；<s:property value="#session.name"/><br>
  获取request属性；<s:property value="#request.name"/><br>
  获取application属性:<s:property value="#application.name"/><br>
<hr>

  </head>
  
  <body>


























<br>
  </body>
</html>
