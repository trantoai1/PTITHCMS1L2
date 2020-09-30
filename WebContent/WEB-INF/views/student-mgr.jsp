<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<base href="${ pageContext.servletContext.contextPath }/" />
</head>
<body>
<form:form action="student-mgr">
<h1>STUDENT MANAGER</h1>
${messages }
<div>
		Nhập tên:
		<input name="name">
		</div>
		<hr/>
		<div>
		Điểm:
		<input name="mark">
		</div>
		<hr/>
		<div>
		Ngành:
		<label>
<input name="major" type="radio" value="APP"/>
Ứng dụng phần mềm
</label>
<label>
<input name="major" type="radio" value="WEB"/>
Thiết kế trang web
</label>
<hr>
</div>
<hr>
<button name="btnInsert">Thêm</button>
<button name="btnUpdate">Cập nhật</button>
<button name="btnDelete">Xóa</button>
<button name="btnReset">Nhập lại</button>

</form:form>
<hr>
<table border="1" style="width:100%">
<tr>
<th> Họ tên</th>
<th> Điểm TB</th>
<th> Ngành</th>
<th> </th>
</tr>
<tr>
<td> Tuấn kiệt</td>
<td> 5</td>
<td> CNTT</td>
<td ><a href="student-mgr?lnkEdit" >Chỉnh sửa</a></td>
</tr>
</table>
</body>
</html>