<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE HTML>
<html>
<head>
    <title><sitemesh:title default="默认title"/></title>
    <%@include file="/WEB-INF/JSPLib/Web/BaseHead.jsp"%>
    <sitemesh:head/>
</head>
<body >
<%@include file="/WEB-INF/JSPLib/Web/WebHead.jsp"%>
<sitemesh:body />
<%@include file="/WEB-INF/JSPLib/Web/WebFoot.jsp"%>
</body>
</html>
