<!--
* NAME		: NoticeView.jsp
* DESC		: �������� ���� ������
* VER		: 1.0
* HISTORY	: 2017.4.10, ȫ�浿, �������α׷� �ۼ�
-->

<%@ page  contentType="text/html; charset=euc-kr"%>
<html>
<head>
</head>
<body>
<center><h1>�������� ����</h1>
<a href="logout.do">�α׾ƿ�</a>

<form action="list.do" method=post>
    <table border=0>
	<tr bgcolor="8f8fbd"> 
		<td  width=20%  align=center>�� ȣ</td>
        <td width=80%>&nbsp;&nbsp;${requestScope.nb.num}</td>
    </tr>
    <tr bgcolor="8f8fbd"> 
		<td  align="center">�� ��</td>
        <td>&nbsp;&nbsp;${requestScope.nb.writer}</td>
    </tr>
	<tr bgcolor="8f8fbd"> 
		<td   align="center">�� ¥</td>
        <td>&nbsp;&nbsp;${requestScope.nb.inDate}</td>
    </tr>
    <tr bgcolor="8f8fbd"> 
		<td  align="center">�� ��</td>
        <td>&nbsp;&nbsp;${requestScope.nb.title}</td>
    </tr>
    <tr><td colspan=2 > 
          <textarea name=cont rows=10 cols=70>${requestScope.nb.content}</textarea>
		</td>
    </tr>
    <tr><td colspan=2 align=center > 
          <input type=submit class=button value="��Ϻ���">
        </td>
    </tr>
    </table>
  </form></center>
</body></html>		
