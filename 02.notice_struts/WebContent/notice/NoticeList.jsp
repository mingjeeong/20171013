<!--
* NAME		: NoticeList.jsp
* DESC		: 공지사항 목록 페이지
* VER		: 1.0
* HISTORY	: 2017.4.10, 홍길동, 최초프로그램 작성
-->

<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import ="java.util.*,notice.model.Notice" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<HTML>
	<HEAD>
		<TITLE>공지사항 </TITLE>
	</HEAD>

	<BODY>
		<P>
		<P align=center>
		<FONT color=#0000ff face=굴림 size=5>
		<STRONG>공지사항 목록보기 </STRONG></FONT></P>
		<P>
		<CENTER>
		<a href="logout.do">로그아웃</a>
		<TABLE border=0 width=70% cellpadding=4 cellspacing=4 style="font-size:10pt">
		<TR>
			<TH width=5% bgcolor=#9999FF><FONT color=white face="굴림"><NOBR>번호</NOBR></FONT></TH>
			<TH width=40% bgcolor=#9999FF><FONT color=white face="굴림"><NOBR>제목</NOBR></FONT></TH>
			<TH width=10% bgcolor=#9999FF><FONT color=white face="굴림"><NOBR>글쓴이</NOBR></FONT></TH>
			<TH width=15% bgcolor=#9999FF><FONT color=white face="굴림"><NOBR>날짜</NOBR></FONT></TH>
			<TH width=15% bgcolor=#9999FF><FONT color=white face="굴림"><NOBR>삭제</NOBR></FONT></TH>
		</TR>
		
		<%-- 페이지 출력 --%>
			<c:forEach var="vo" items="${requestScope.array}" >
				  <tr align=center>
					<TD width=5% bgcolor=#eeeeee>	${vo.num} </TD> 
					<TD width=15% bgcolor=#eeeeee>
					<a href="view.do?num=${vo.num}">${vo.title}</a>
					</TD>
					<TD width=%10 bgcolor=#eeeeee> ${vo.writer}</TD>		
					<TD width=%10 bgcolor=#eeeeee> ${vo.inDate}</TD>		
					<TD width=15% bgcolor=#eeeeee><a href="delete.do?num=${vo.num}">삭제</a></TD>
				  </tr>
			</c:forEach>

		</TABLE>
		<p>
		<FONT size=2>&nbsp&nbsp&nbsp[<A href="input.do">글쓰기</A>] </FONT>
		<!--<FONT size=2>&nbsp&nbsp&nbsp[<A href="notice/noticeInput.jsp">글쓰기</A>] </FONT>-->
	</BODY>
</HTML>
