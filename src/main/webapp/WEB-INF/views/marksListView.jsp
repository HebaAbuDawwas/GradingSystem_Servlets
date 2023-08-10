<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f5f5f5;
    }
    .container {
      text-align: center;
      margin: 20px auto;
      background-color: white;
      padding: 20px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h1 {
      margin-bottom: 20px;
    }
    h2 {
      margin-top: 20px;
    }
    table {
      border-collapse: collapse;
      width: 80%; /* Adjust this value to suit your page */
      margin: 20px auto;
      border: 1px solid #ddd;
      background-color: white;
    }
    th, td {
      border: 1px solid #ddd;
      padding: 8px;
      text-align: left;
    }
    th {
      background-color: #f2f2f2;
    }
  </style>
</head>
<body>
<div class="container">

  <h2> <%= request.getAttribute("studentName") %> marks :</h2> <!-- Display student name -->


<table>
  <tr>
    <th>Course</th>
    <th>Mark</th>
  </tr>
  <%
    Map<String, Integer> mapData = (Map<String, Integer>) request.getAttribute("mapData");
    if (mapData != null && !mapData.isEmpty()) {
      for (Map.Entry<String, Integer> entry : mapData.entrySet()) {
  %>
  <tr>
    <td><strong><%= entry.getKey() %></strong></td>
    <td><%= entry.getValue() %></td>
  </tr>
  <%
    }
    // Calculate sum and average
    int sum = 0;
    Set<Map.Entry<String, Integer>> entries = mapData.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      sum += entry.getValue();
    }
    double average = (double) sum / entries.size();
  %>
  <tr>
    <td><strong>Total</strong></td>
    <td><%= sum %></td>
  </tr>
  <tr>
    <td><strong>Average</strong></td>
    <td><%= average %></td>
  </tr>
  <%
  } else {
  %>
  <tr>
    <td colspan="2">No map data available.</td>
  </tr>
  <%
    }
  %>
</table>

</div>

</body>
</html>