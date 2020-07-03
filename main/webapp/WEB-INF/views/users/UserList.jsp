<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="user_list">
<table id="userlist_table">
  <tr>
    <th>No.</th>
    <th>아이디</th>
    <th>이름</th>
    <th>전화번호</th>
  </tr>
<c:forEach var="user" items="${users}" varStatus="status">
	<tr>
	<td>`${status.count}`</td>
	<td>`${user.userid}`</td>
	<td>`${user.telephone}`</td>
	</tr>
</c:forEach>
</table>	
</div>

<script src="${javascript}/store/user.js"></script> 
<script>

</script>
<style>
#userlist_table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#userlist_table td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
#userlist_table tr:nth-child(even) {
  background-color: #dddddd;
}
</style> 