<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSP test</title>
    <meta name="viewport" content="width=device-width, initialscale=1">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" rel="stylesheet">
    <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.j"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
</head>

<body>
<%
  String inputText = request.getParameter("inputText");
%>
<a href="MySrv">
    <button type="button" class="btn btn-default btn-lg" >
        <span class="glyphicon glyphicon-resize-small" ></span> Connect To DB
    </button>
</a>

</body>
</html>
