
<%@page contentType="text/html; charset=UTF-8" %>>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>

  <title>My JSP 'StrutsLabel.jsp' starting page</title>
 <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">

</head>
  
  <body>
  <s:checkbox label="学习" name="学习" value="true"/>
<s:checkbox  label="电影" name="电影" />
<%-- <s:checkboxlist label="个人爱好" list="{'学习'，'玩游戏','看电视剧','吃','睡'}" name="love"></s:checkboxlist> --%>
<s:form>
<s:combobox label="颜色选择" name="colorname" readonly="false" headerValue="---请选择---" headerKey="1" list="{'red','blue'}"/>
</s:form>
</body>
</html>
