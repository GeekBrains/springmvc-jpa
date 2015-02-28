<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Registration page</title>
</head>
<body>
<!-- the commandName attribute is the key which specifies name of the model class object that acts as a backing object for this form -->
<form:form method="POST" action="/mvcdemo/register" commandName="userForm">
<table>
  <tr>
     <td><form:label path="userName">USER NAME</form:label></td> 
     <td> <form:input path="userName"/></td>
  </tr> 
  
   <tr>
     <td> <form:label path="password">PASSWORD</form:label> </td>
     <td> <form:input path="password"/></td>
  </tr> 
  
   <tr>
     <td> <form:label path="gender">GENDER</form:label> </td>
     <td> <form:radiobutton path="gender" value ="M" label="M"/></td>
      <td> <form:radiobutton path="gender" value ="F" label="F"/></td>
  </tr> 
  
   <tr>
     <td> <form:label path="email">E-MAIL</form:label> </td>
     <td> <form:input path="email"/></td>
  </tr> 
  
   <tr>
     <td> <form:label path="profession">PROFESSION</form:label> </td>
     <td> <form:select path="profession" items="${professionList}"></form:select>
  </tr> 
  
   <tr>
     <td> <form:label path="location">PREFFERED LOCATION</form:label> </td>
     <td> <form:input path="location"/></td>
  </tr> 
  
  

<tr>
<td><form:label path="communityList">COMMUNITY</form:label></td>
<td><form:checkboxes path="communityList" items="${communityList}" itemValue="key" itemLabel="value" /></td>
</tr>

</tr>
   <tr>
       <td colspan="2" align="center"><input type="submit" value="Register" /></td>
   </tr>
  
</table>

</form:form>
</body>
</html>