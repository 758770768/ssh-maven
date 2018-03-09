<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.0.0.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body>
	<script type="text/javascript">
		$.ajax({
			url : "${pageContext.request.contextPath}/abc",
			dataType : "json",
			type : "post",
			success : function(data) {
					$("table").addClass("table table-striped");
				for(var i in data){
					$("table").append("<tr> <td>"+data[i].eid+"</td><td>"+data[i].ename+"</td><td>"+data[i].bdate+"</td><td>"+data[i].sex+"</td><td>"+data[i].city+"</td> </tr>");
				}
				$("tr:even").addClass("info");
				$("tr:odd").addClass("success");
			}
		});
	</script>

  <table>
   <tr>
    <th>编号</th>
    <th>姓名</th>
    <th>开始日期</th>
    <th>性别</th>
    <th>城市</th>
   </tr>
  </table>

</body>
</html>