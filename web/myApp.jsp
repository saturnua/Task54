<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSP test</title>
    <meta name="viewport" content="width=device-width, initialscale=1">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" rel="stylesheet">
    <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.j"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script type="text/javascript" src="javascript.js"></script>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>


<body onload="init()">

<form name="autofillform" action="autocomplete">
  <table border="0" cellpadding="5">
    <thead>
    <tr>
      <th>Search</th>
      <th>Please input names</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td><strong>Composer Name:</strong></td>
      <td><input type="text"
                 size="40"
                 id="complete-field"
                 onkeyup="doCompletion();"></td>
    </tr>
    <tr>
        <td id="auto-row" colspan="2">
            <table id="complete-table" />
        </td>
    </tr>
    </tbody>
  </table>
</form>


</body>
</html>
