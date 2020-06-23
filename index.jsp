<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--导入标签库，指定mytag前缀的标签--%>
<%@ taglib uri="http://mycompany.com" prefix="mytag"%>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    WELCOME
<br/>

    <%--使用标签，其中mytag是标签前缀，根据taglib的编译指令--%>
<mytag:helloword/>
    <br/>
<mytag:attribute userName = "dongdong" passWord="1234"/>
</body>
</html>
