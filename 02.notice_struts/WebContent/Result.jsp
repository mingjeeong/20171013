<!--
* NAME		: Result.jsp
* DESC		: �α���,����� ��� ������
* VER		: 1.0
* HISTORY	: 2017.4.10, ȫ�浿, �������α׷� �ۼ�
-->
<%@ page contentType="text/html;charset=euc-kr" %>

<HTML>
	<HEAD>
		<TITLE>���ȭ��</TITLE>
		<META http-equiv="Content-Type" content="text/html">
		<meta http-equiv="refresh" content="0;url='list.do')">
	</HEAD>
	<BODY BGCOLOR="#FFFFFF" leftmargin="0" topmargin="0" marginwidth=0 marginheight=0>
		<TABLE BORDER=0 CELLPADDING=0 CELLSPACING=0 WIDTH=100% HEIGHT=100%>
			<TR>
				<TD align=center>
					<% String msg=(String)request.getAttribute("msg"); %>
					<center><FONT face="����" size=3> <%=msg%></FONT></center>
					<p>
					<IMG SRC="images/dog.gif" WIDTH=100 HEIGHT=60 BORDER=0>
					<p> <p>
				</TD>
			</TR>
		</TABLE>
	</BODY>
</HTML>
