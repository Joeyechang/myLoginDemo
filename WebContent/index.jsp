<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
  </head>
  <body>
    <p>这是主页</p>
    <s:form method="post" action="user">
    	<s:textfield label="用户名" name="login_name"></s:textfield>
    	<s:password label="密码" name="login_pwd"/>
    	<s:submit value="登录"></s:submit>
    </s:form>
  </body>
</html>
