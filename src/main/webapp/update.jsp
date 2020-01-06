<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="update" method="post">
		<p>
			编号:<input name="wid" value="${worker.wid }">
		</p>
		<p>
			关键字:<input name="wname" value="${worker.wname }">
		</p>
		<p>
			描述:<input name="whear" value="${worker.whear }">
		</p>
		<p>
			公司名称:<input name="workname" value="${worker.workname }">
		</p>
		<p>
			主营产品:<input name="produces" value="${worker.produces }">
		</p>
		<p>
			地址:<input name="addr" value="${worker.addr }">
		</p>
		<p>
			注册资本:<input name="money" value="${worker.money }">
		</p>
		<p>
			成立时间:<input type="date" name="wtime"
				value="<fmt:formatDate value="${worker.wtime }" pattern="yyyy-MM-dd" />">
		</p>
		<p>
			年检日期:<input type="date" name="ntime"
				value="<fmt:formatDate value="${worker.ntime }" pattern="yyyy-MM-dd" />">
		</p>

		<p>
			年检状态:<select name="ntype">
				<option value="审核通过">审核通过</option>
				<option value="审核未通过">审核未通过</option>
				<option value="待定">待定</option>
			</select>
		</p>
		<p>
			<input type="submit" value="审核">
		</p>
	</form>
</body>
</html>