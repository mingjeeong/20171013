<!--
* NAME		: NoticeList.jsp
* DESC		: �������� ��� ������
* VER		: 1.0
* HISTORY	: 2017.4.10, ȫ�浿, �������α׷� �ۼ�
-->

<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import ="java.util.*,notice.model.Notice" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<HTML>
	<HEAD>
		<TITLE>�������� </TITLE>
	</HEAD>

	<BODY>
		<P>
		<P align=center>
		<FONT color=#0000ff face=���� size=5>
		<STRONG>�������� ��Ϻ��� </STRONG></FONT></P>
		<P>
		<CENTER>
		<a href="logout.do">�α׾ƿ�</a>
		<TABLE border=0 width=70% cellpadding=4 cellspacing=4 style="font-size:10pt">
		<TR>
			<TH width=5% bgcolor=#9999FF><FONT color=white face="����"><NOBR>��ȣ</NOBR></FONT></TH>
			<TH width=40% bgcolor=#9999FF><FONT color=white face="����"><NOBR>����</NOBR></FONT></TH>
			<TH width=10% bgcolor=#9999FF><FONT color=white face="����"><NOBR>�۾���</NOBR></FONT></TH>
			<TH width=15% bgcolor=#9999FF><FONT color=white face="����"><NOBR>��¥</NOBR></FONT></TH>
			<TH width=15% bgcolor=#9999FF><FONT color=white face="����"><NOBR>����</NOBR></FONT></TH>
		</TR>
		
		<%-- ������ ��� --%>
			<c:forEach var="vo" items="${requestScope.array}" >
				  <tr align=center>
					<TD width=5% bgcolor=#eeeeee>	${vo.num} </TD> 
					<TD width=15% bgcolor=#eeeeee>
					<a href="view.do?num=${vo.num}">${vo.title}</a>
					</TD>
					<TD width=%10 bgcolor=#eeeeee> ${vo.writer}</TD>		
					<TD width=%10 bgcolor=#eeeeee> ${vo.inDate}</TD>		
					<TD width=15% bgcolor=#eeeeee><a href="delete.do?num=${vo.num}">����</a></TD>
				  </tr>
			</c:forEach>

		</TABLE>
		<p>
		<FONT size=2>&nbsp&nbsp&nbsp[<A href="input.do">�۾���</A>] </FONT>
		<!--<FONT size=2>&nbsp&nbsp&nbsp[<A href="notice/noticeInput.jsp">�۾���</A>] </FONT>-->
	</BODY>
</HTML>
