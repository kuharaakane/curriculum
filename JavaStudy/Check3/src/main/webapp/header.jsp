<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 日付インポート -->
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<div class="header common">
    <label class="log">login</label>
 <!-- 日付 -->
    <label class="sdf">
        <% Date date = new Date();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
           String formatDate = sdf.format(date);%>
        <%= formatDate %>
     </label>
    
 </div>

<style> 
    .common{
    background-color: gray;           
    font-size: 10px;
    }                   
    .log{
    color: white;
    display: inline-block; 
    }                
    .sdf{
    padding: 10px;
    color: black;
    }         
</style> 
                
</body>
</html>
