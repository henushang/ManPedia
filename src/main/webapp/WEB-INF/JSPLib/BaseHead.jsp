<%@ page import="com.manpedia.global.constants.WebConf" %>
<%@page language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%!
    //项目路径
    static String base = WebConf.base;
    static  String basecss = WebConf.basecss;
    static String basejs = WebConf.basejs;
    static  String baseimg = WebConf.baseimg;
%>
<c:set var="base" value="<%=base%>"></c:set>
<c:set var="basecss" value="<%=basecss%>"></c:set>
<c:set var="basejs" value="<%=basejs%>"></c:set>
<c:set var="baseimg" value="<%=baseimg%>"></c:set>

<script type="text/javascript" src="${basejs}/js/jquery/jquery.min.js"></script>