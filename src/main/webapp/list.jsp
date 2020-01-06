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

	<form action="tolist" method="post">
		<p>
			编号:<input name="wid" value="${map.wid }"> 关键字:<input
				name="wname" value="${map.wname }"> 描述:<input name="whear"
				value="${map.whear }"> 公司名称:<input name="workname"
				value="${map.workname }">主营产品:<input name="produces"
				value="${map.produces }">地址:<input name="addr"
				value="${map.addr }">
		</p>
		<p>
			注册资本:<input name="money1" value="${map.money1 }">至 <input
				name="money2" value="${map.money2 }"> 成立时间:<input
				type="date" name="wtime1" value="${map.wtime1 }">至 <input
				type="date" name="wtime2" value="${map.wtime2 }">年检日期:<input
				type="date" name="ntime1" value="${map.ntime1 }">至 <input
				name="ntime2" type="date" value="${map.ntime2 }">年检状态:<select
				name="tid">
				<option value="审核通过">审核通过</option>
				<option value="审核未通过">审核未通过</option>
				<option value="待定">待定</option>
			</select>
		</p>
		<p>
			<input type="submit" value="查询">
		</p>
	</form>
	<table>
		<tr>
			<th>编号</th>
			<th>关键字</th>
			<th>描述</th>
			<th>公司名称</th>
			<th>主营产品</th>
			<th>地址</th>
			<th>注册资本(万元)</th>
			<th>成立时间</th>
			<th>年检时间</th>
			<th>年检状态</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${info.list }" var="v">
			<tr>
				<td>${v.wid }</td>
				<td>${v.wname }</td>
				<td>${v.whear}</td>
				<td>${v.workname }</td>
				<td>${v.produces }</td>
				<td>${v.addr }</td>
				<td>${v.money }</td>
				<td><fmt:formatDate value="${v.wtime }" pattern="yyyy-MM-dd" /></td>
				<td><fmt:formatDate value="${v.ntime }" pattern="yyyy-MM-dd" /></td>
				<td>${v.ntype }</td>
				<td>${v.xiangqing }</td>
				<td><a href="tofind?wid=${v.wid }"><input type="button"
						value="年检审核"></td>
			</tr>
		</c:forEach>
		<!-- 格式为:总记录/总页数 页码编号系列 比如 2,3,4... 跳转X页
		 -->
		<tr>
			<th colspan="15">${info.total}条记录/${info.pages }页<a
				href="tolist?pageNum=${prePage}"><input type="button"
					value="上一页"></a> <c:forEach begin="${info.pageNum }"
					end="${info.pageNum+3 }" step="1" var="t">
					<a href="tolist?pageNum=${t}"><input type="button"
						value="${t }"></a>
				</c:forEach><a href="tolist?pageNum=${info.nextPage}"><input type="button"
					value="下一页"></a>
				<form action="tolist" method="post">
					跳转到<input name="pageNum">页 <input type="submit" value="查询">
				</form>
			</th>
		</tr>
	</table>

</body>
</html>