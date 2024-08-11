package com.demo.movie.beans;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
// 
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ApiResponse {
  private String status;
  private Integer code;
public ApiResponse() {
	super();
	// TODO Auto-generated constructor stub
}
public ApiResponse(String status, Integer code) {
	super();
	this.status = status;
	this.code = code;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}
  
  
}
 
 