<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@page import="java.sql.*" %>
<%@page import="Project.Crudoperation" %>
<%@page import="Project.Patient" %>
<%@page import="java.util.List" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="ViewPatient.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body class="bg-black" >
   <div class="container bg-danger">
   <div class="h2 text-center ">Patient Details</div>
   </div>
    <hr>
    
	<div class="container ">
	 <table class="table  bg-success table-hover">
    <tr class="bg-danger" height="60px">
      <th class=" lead text-center text-white"> ID</th>
      <th class=" lead text-center"> NAME</th>
      <th class=" lead text-center"> DISEASE</th>
      <th class=" lead text-center"> ADDRESS</th>
      <th class=" lead text-center"> GENDER</th>
      <th class=" lead text-center"> DEPOSITED</th>
      <th class=" lead text-center"> PENDING</th>
      <th class=" lead text-center"> PATIENTTYPE</th>
      <th class=" lead text-center"> ACTION</th>
      <th class=" lead text-center"> ACTION</th>
    </tr>
    <% List<Patient> patients=Crudoperation.userdetails();
      for(Patient p:patients){%>
    <tr class="bg-success text-center lead "> 
      <td><%out.println(p.getPatientid());%></td>
      <td><%out.println(p.getPatientname()); %></td>
      <td><%out.println(p.getDisease()); %></td>
      <td><%out.println (p.getAddress());%></td>
      <td><%out.println (p.getGender());%></td>
      <td><%out.println (p.getDeposited());%></td>
      <td><%out.println(p.getPending()); %></td>
      <td><%out.println (p.getPatientype()); %></td>
      <td><a href="DeleteServlet?id=<%=p.getPatientid()%>" class="btn btn-info">DELETE</a></td>
      <td><button class="btn btn-info" onclick=<%%>>EDIT</button></td>
    </tr>
    <%}%>
     </table>
     </div>
</body>
</html>