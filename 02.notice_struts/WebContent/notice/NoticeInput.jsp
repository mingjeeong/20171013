<!--
* NAME		: NoticeInput.jsp
* DESC		: �������� �Է� ������
* VER		: 1.0
* HISTORY	: 2017.4.10, ȫ�浿, �������α׷� �ۼ�
-->

<%@ page contentType="text/html;charset=euc-kr" %>
<html>
<head> 
<script language="JavaScript">
<!--
function confirm(){		
	if (document.input.writer.value==''){
		alert("�̸��� �Է��Ͻʽÿ�.");
		document.input.id.focus();
		return;
	}
	if(document.input.title.value==''){
		alert("������ �Է��Ͻʽÿ�.");
		document.input.title.focus();
		return;
	}
	if(document.input.content.value==''){
		alert("������ �Է��Ͻʽÿ�.");
		document.input.cont.focus();
		return;
	}
	document.input.submit();
}
-->
</script>
</head>

<body>
<center><h1>�������� �۾���</h1>
<a href="logout.do">�α׾ƿ�</a>

<form action="save.do" method=post  name=input>
    <table border=0>
      <tr > 
		<td  width=103 bgcolor="8f8fbd" align="center">�� ��</td>
        <td><input type=text  name=writer size="20" value=${sessionScope.user}></td>
      </tr>
      <tr> 
		<td width="103" bgcolor="8f8fbd" align="center">�� ��</td>
        <td><input type=text  name=title size="51" ></td>
      </tr>
      <tr>
		<td colspan=2 > 
          <textarea name=content rows=10 cols=70></textarea>
		</td>
      </tr>
      <tr>
		<td colspan=2 align=center > 
          <input type=button  value="����"  onclick="javascript:confirm()">
          <input type=reset  value="���">
        </td>
      </tr>
    </table>
 </form>
 </center>
</body>
</html>		
