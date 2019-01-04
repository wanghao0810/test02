
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <C:forEach items="${list}" var="account">
       ${account.name}
   </C:forEach>
</body>
</html>
