<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h4 class="mt-3">Add Content</h4>
	<hr>
	<div class="card">
	  <div class="card-header bg-banner">
	   Content From Element
	  </div>
	  <div class="card-body">
	    <%-- <form action="add-content.html" method="post" onsubmit="return validate();">
		  <div class="form-group">
		    <label for="title">Title</label>
		    <input type="text" class="form-control" id="" placeholder="Enter the title" name="title">
		  </div>
		  <div class="form-group">
		    <label for="brief">Brief</label>
		    <textarea name="brief" rows="4" class="form-control" id="brief"></textarea>
		  </div>
		  <div class="form-group">
		    <label for="content">Content</label>
		    <textarea name="content" rows="6" class="form-control" id="content"></textarea>
		  </div>
		  <div class="form-group">
		    <label for="content">Choose Member</label>
		    <select name="member.id">
		    	<c:forEach items="${members }" var="item">
		    		<option value="${item.id }">${item.firstName }</option>
		    	</c:forEach>
		    </select>
		  </div>
		  <button type="submit" class="btn btn-outline-secondary">Submit Button</button>
		  <button type="reset" class="btn btn-outline-secondary">Reset Button</button>
		</form> --%>
		${message }
		<form:form action="add-content.html" method="post" modelAttribute="content">
		  <form:errors path="*" element="ul"></form:errors>
		  <div class="form-group">
		    <label for="title">Title</label>
		    <form:input class="form-control" id="" placeholder="Enter the title" path="title"/>
		  </div>
		  <div class="form-group">
		    <label for="brief">Brief</label>
		    <form:textarea path="brief" rows="4" class="form-control" id="brief"/>
		  </div>
		  <div class="form-group">
		    <label for="content">Content</label>
		    <form:textarea path="content" rows="6" class="form-control" id="content"/>
		  </div>
		  <div class="form-group">
		    <label for="content">Choose Member</label>
		    <form:select path="member.id" items="${members }" itemLabel="firstName" itemValue="id" class="form-control" />
		  </div>
		  <form:button type="submit" class="btn btn-outline-secondary">Submit Button</form:button>
		  <form:button type="reset" class="btn btn-outline-secondary">Reset Button</form:button>
		</form:form> 
  </div>
</div>
