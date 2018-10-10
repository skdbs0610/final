<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>사원등록</h1>
<form>
<p>
	사원넘버 : ${empSeq}
	
</p>
 <div class="form-group">
		<label>사원 이름</label> <input
			type="text" name="empName" class="form-control" placeholder="이름">
	</div>
	<div class="form-group">
		<label>부서-직급</label>
		<div class="row">
			<div class="col">
				<select class="form-control" placeholder="부서" name="dpt">
					<option>부서를 선택하세요.</option>
					<c:forEach var="dept" items="${depts}">
						<option value="${dept.DID}">${dept.DNAME}</option>
					</c:forEach>
				</select>
			</div>
			<div class="col">
				<select class="form-control" placeholder="직급" name="position">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label>입사 날짜</label> 
		<input type="date" class="form-control" name="joindate" >
	</div>
	<div class="form-group">
		<button type="submit"  class="form-control btn btn-outline-primary">사원등록</button>
	</div>
</form>