<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="menu.jsp" %>
<%
    String pageLoaded = "empty.jsp";
try{
    String nullEscaper = request.getParameter("page");
    if(nullEscaper.length()!=0) pageLoaded = nullEscaper+".jsp";
}
catch (Exception e){}
%>



<jsp:include page="<%= pageLoaded %>"/>


