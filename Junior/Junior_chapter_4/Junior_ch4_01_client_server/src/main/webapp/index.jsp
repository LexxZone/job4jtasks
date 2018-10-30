<%@ page import="parsentev.servlets.UserStorage" %>
<%@ page import="parsentev.servlets.User" %><%--
  Created by IntelliJ IDEA.
  User: codeinside
  Date: 05.10.18
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>True Title</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/echo" method="post">
    Login : <input type="text" name="login"><br />
    Email : <input type="text" name="email"><br />
    <input type="submit">
</form>
<br />
<table cellpadding="1" cellspacing="1" border="1">
    <tr>
        <th>login</th>
        <th>email</th>
    </tr>
    <% for(User user : UserStorage.getInstance().getUsers()) {%>
    <tr>
        <td><%=user.getLogin()%></td>
        <td><%=user.getEmail()%></td>
    </tr>
    <% } %>
</table>

</body>
</html>
