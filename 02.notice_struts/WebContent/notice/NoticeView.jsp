<!--
* NAME		: NoticeView.jsp
* DESC		: 공지사항 보기 페이지
* VER		: 1.0
* HISTORY	: 2017.4.10, 홍길동, 최초프로그램 작성
-->

<%@ page  contentType="text/html; charset=euc-kr"%>
<html>
<head>
</head>
<body>
<center><h1>공지사항 보기</h1>
<a href="logout.do">로그아웃</a>

<form action="list.do" method=post>
    <table border=0>
	<tr bgcolor="8f8fbd"> 
		<td  width=20%  align=center>번 호</td>
        <td width=80%>&nbsp;&nbsp;${requestScope.nb.num}</td>
    </tr>
    <tr bgcolor="8f8fbd"> 
		<td  align="center">이 름</td>
        <td>&nbsp;&nbsp;${requestScope.nb.writer}</td>
    </tr>
	<tr bgcolor="8f8fbd"> 
		<td   align="center">날 짜</td>
        <td>&nbsp;&nbsp;${requestScope.nb.inDate}</td>
    </tr>
    <tr bgcolor="8f8fbd"> 
		<td  align="center">제 목</td>
        <td>&nbsp;&nbsp;${requestScope.nb.title}</td>
    </tr>
    <tr><td colspan=2 > 
          <textarea name=cont rows=10 cols=70>${requestScope.nb.content}</textarea>
		</td>
    </tr>
    <tr><td colspan=2 align=center > 
          <input type=submit class=button value="목록보기">
        </td>
    </tr>
    </table>
  </form></center>
</body></html>		
