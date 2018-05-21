<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
<body>
 <spring:url value="/customer/save" var="saveURL" />
 
 <form:form action="${saveURL }" method="POST" modelAttribute="customerForm">
  <form:hidden path="id"/>
  <table>
   <tr>
    <td>Firstname</td>
    <td><form:input path="firstname"/></td>
    <td><form:errors path="firstname" cssClass="error"/></td>
   </tr>
   <tr>
    <td>Lastname</td>
    <td><form:input path="lastname"/></td>
   </tr>  
   <tr>
    <td>Gender: </td>
    <td>
     <form:radiobutton path="gender" value="Male" /> Male
     <form:radiobutton path="gender" value="Female" /> Female
    </td>
   </tr> 
   <tr>
    <td>Address</td>
    <td><form:textarea path="address" rows="3" /></td>
   </tr>
   <tr>
    <td></td>
    <td><button type="submit">Save</button></td>
   </tr>
  </table>
 </form:form>
</body>
</html>