<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--header include-->
<%@ include file ="header.jsp" %>

<!-- name、idの入力エリアを作成しなさい -->
<div class="content">

<!-- table 表 <tr>～</tr>で表の横部分を指定し、その中に<th>～</th>や<td>～</td>で表題や縦軸を指定してセルを定義
thは見出しなどに使われる。 -->
    <table> 
        <tr>
            <td>
                <label for="name">name</label> 
                <!--labelタグでフォームの項目名と構成部品（チェックボックス）を関連付ける
                <form>タグで作成したフォームの中でテキスト入力欄やボタンなどの部品を作成する要素-->
            </td>
            <td>
                <input type="text" id="name">
            </td>
        </tr>
        <tr>
            <td> 
                <label for="id">id</label>
            </td>
            <td>
                <input type="text" id="id">
            </td>    
       </tr>
    </table> 
    
      <style>
        .content{
             padding-top: 50px;
             padding-bottom: 50px;
          }
      </style> 
</div> 
 
 
 <!--footer  include-->
 
 <%@ include file ="footer.jsp" %>
</body>
</html>