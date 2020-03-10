package com.classroom.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
  
  private static final long serialVersionUID = 4L;
  
  private Integer id;
  
  private String userNo;
  
  private String name;
  
  private String password;
  
  private Integer role;
  
  public User() {
    super();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserNo() {
    return userNo;
  }

  public void setUserNo(String userNo) {
    this.userNo = userNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getRole() {
    return role;
  }

  public void setRole(Integer role) {
    this.role = role;
  }
}
