<!--
* NAME		: NoticeInput.jsp
* DESC		: 공지사항 입력 페이지
* VER		: 1.0
* HISTORY	: 2017.4.10, 홍길동, 최초프로그램 작성
-->

<%@ page contentType="text/html;charset=euc-kr" %>
<html>
<head> 
<script language="JavaScript">
<!--
function confirm(){		
	if (document.input.writer.value==''){
		alert("이름을 입력하십시요.");
		document.input.id.focus();
		return;
	}
	if(document.input.title.value==''){
		alert("제목을 입력하십시요.");
		document.input.title.focus();
		return;
	}
	if(document.input.content.value==''){
		alert("내용을 입력하십시요.");
		document.input.cont.focus();
		return;
	}
	document.input.submit();
}
-->
</script>
</head>

<body>
<center><h1>공지사항 글쓰기</h1>
<a href="logout.do">로그아웃</a>

<form action="save.do" method=post  name=input>
    <table border=0>
      <tr > 
		<td  width=103 bgcolor="8f8fbd" align="center">이 름</td>
        <td><input type=text  name=writer size="20" value=${sessionScope.user}></td>
      </tr>
      <tr> 
		<td width="103" bgcolor="8f8fbd" align="center">제 목</td>
        <td><input type=text  name=title size="51" ></td>
      </tr>
      <tr>
		<td colspan=2 > 
          <textarea name=content rows=10 cols=70></textarea>
		</td>
      </tr>
      <tr>
		<td colspan=2 align=center > 
          <input type=button  value="저장"  onclick="javascript:confirm()">
          <input type=reset  value="취소">
        </td>
      </tr>
    </table>
 </form>
 </center>
</body>
</html>		
