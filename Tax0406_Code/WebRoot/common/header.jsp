<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	//访问路径为：http://localhost:8080/blue/response.jsp   request.getContextPath()得到的就是  /blue
    pageContext.setAttribute("basePath", request.getContextPath()+"/") ; 
%>

    <script type="text/javascript" src="${basePath}js/jquery/jquery-1.10.2.min.js"></script>
    <link href="${basePath}css/skin1.css" rel="stylesheet" type="text/css" />
    
