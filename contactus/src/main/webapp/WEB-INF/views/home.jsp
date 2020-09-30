<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Changjin Company</title>
	<link href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">	
</head>
<body>
<header class="ccheader">
	<h1>Contact Us</h1>
    <h2>Changjin Company</h2>	
</header>

<div class="wrapper">
    <form method="post" action="" class="ccform">
    <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-user fa-2x"></i></span>
        <input class="ccformfield" type="text" name ="fullName" placeholder="Full Name" required>
    </div>
    <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-envelope fa-2x"></i></span>
        <input class="ccformfield" type="text" name ="Email" placeholder="Email" required>
    </div>
    <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-mobile-phone fa-2x"></i></span>
        <input class="ccformfield" type="text" name ="Phone" placeholder="Phone">
    </div>
     <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-info fa-2x"></i></span>
        <input class="ccformfield" type="text" name ="Subject" placeholder="Subject" required>
    </div>
    <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-comment fa-2x"></i></span>
        <textarea class="ccformfield" rows="8" name ="Message" placeholder="Message" required></textarea>
    </div>
    <div class="ccfield-prepend">
        <input class="ccbtn" type="submit" value="Submit">
    </div>
    </form>
</div>

</body>
</html>