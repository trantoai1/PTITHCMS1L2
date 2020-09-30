<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Kết quả JavaBean</title>
<base href="${ pageContext.servletContext.contextPath }/" />
</head>
<body>
<h1>JavaBean</h1>
<div>
Tên: ${student.name }
</div>
<div>
Điểm: ${student.mark }
</div>
<div>
Ngành: ${student.major }
</div>
</body>
</html>