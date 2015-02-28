<%@page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="label.loginpage.title" /></title>
<link rel="stylesheet" href="/resources/css/style.css" media="screen"
	type="text/css" />
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">
<!--[if lt IE 9]>
  	<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
 <![endif]-->
</head>
<body>
	<div class="container">
		<div id="welcomemessage">
			<h2>
				<spring:message code="label.loginpage.welcomemessage" />
			</h2>

			<p class="welcomemessage">
				<spring:message code="label.loginpage.welcomesubmessage" />
			</p>
		</div>
		<div id="login">
			<c:if test="${fn:trim(msg) ne ''}">
			<div class="errorMsg">	
				<span class="error">
					<spring:message code="${msg}" />
				</span>
			</div>	
			</c:if>
			<form:form action="/mvcdemo/doLogin"  method="post" modelAttribute="userFormBean" >
				<fieldset class="clearfix" style="border: none;">
					<p>
						<span class="fontawesome-user"></span>
						<form:input path="loginFormBean.emailId" placeholder="Email Id"/>
						<form:errors path="loginFormBean.emailId" cssClass="error" element="div" delimiter="div"/>
					</p>
					
					<p>
						<span class="fontawesome-lock"></span>
						<form:password path="loginFormBean.password" placeholder="Password"/>
						<form:errors path="loginFormBean.password" cssClass="error" element="div" delimiter="div"/>
					</p>
						
					<p>
						<input type="submit" value="Sign In">
					</p>
				</fieldset>
			</form:form>
			<p class="signup">
				<spring:message code="label.loginpage.signupmessage"/>
				<span class="fontawesome-arrow-right"></span>
			</p>
			<form:form action="/mvcdemo/doRegsitration" method="post" modelAttribute="userFormBean">
				<fieldset class="clearfix" style="border: none;">
					<p>
						<span class="fontawesome-user"></span>
						<form:input path="registerFormBean.fullName" placeholder="Full Name"/>
					</p>
					<form:errors path="registerFormBean.fullName" cssClass="error"/>
					<p>
						<span class="fontawesome-user"></span>
						<form:input path="registerFormBean.emailId" placeholder="Email Id"/>
					</p>
					<form:errors path="registerFormBean.emailId" cssClass="error"/>
					<p>
						<span class="fontawesome-lock"></span>
						<form:password path="registerFormBean.password" value="Password" placeholder="Password"/>
					</p>
					<form:errors path="registerFormBean.password" cssClass="error"/>
					<p>
						<input type="submit" value="Register">
					</p>
				</fieldset>
			</form:form>
		</div>
		<!-- end login -->
	</div>
</body>
</html>
