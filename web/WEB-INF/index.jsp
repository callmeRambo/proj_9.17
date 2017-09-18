<%--
  Created by IntelliJ IDEA.
  User: yuli510
  Date: 17-9-17
  Time: 下午1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>index Hello World</title>
</head>
<body>
    <h1>Hello World From Struts2</h1>
    <form action="hello">
      <label >please enter your name</label>
      <input type="text" name="name"/>
      <input type="submit" value="Say hello"/>
    </form>

<%--<form action="login.action" method="post">--%>

  <%--<talbe>--%>
    <%--<tr>--%>
      <%--<td>username: </td>--%>
      <%--<td><input type="text" name="userName"></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
      <%--<td>password: </td>--%>
      <%--<td><input type="password" name="password"></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
      <%--<td align="center"></td>--%>
      <%--<td align="center">--%>
        <%--<input type="submit" value="deng lu button">--%>
        <%--<input tupe="reset" value="reset buttion">--%>
      <%--</td>--%>
    <%--</tr>--%>
  <%--</talbe>--%>
<%--</form>--%>

</body>
</html>
