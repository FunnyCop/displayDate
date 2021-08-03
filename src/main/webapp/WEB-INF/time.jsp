<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Date</title>

    <script type="text/javascript" src="js/time.js"></script>    
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <p class = "time">
        <c:out value="${ time }"/>
    </p>
</body>
</html>