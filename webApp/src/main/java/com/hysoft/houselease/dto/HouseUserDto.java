package com.hysoft.houselease.dto;

import java.util.Date;

/**
 * Created by yulifan on 2017/6/2.
 */
public class HouseUserDto extends BaseDto{
   private Integer hoId;
   private String userName;
   private String userTel;
   private String userAddress;
   private String identNumber;
   private String identPhotos;
   private String status;
   private Integer userType;

   public Integer getHoId() {
    return hoId;
   }

   public void setHoId(Integer hoId) {
      this.hoId = hoId;
   }

   public String getUserName() {
    return userName;
   }

   public void setUserName(String userName) {
    this.userName = userName;
   }

   public String getUserTel() {
    return userTel;
   }

   public void setUserTel(String userTel) {
      this.userTel = userTel;
   }

   public String getUserAddress() {
     return userAddress;
   }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  public String getIdentNumber() {
    return identNumber;
  }

  public void setIdentNumber(String identNumber) {
    this.identNumber = identNumber;
  }

  public String getIdentPhotos() {
    return identPhotos;
  }

  public void setIdentPhotos(String identPhotos) {
    this.identPhotos = identPhotos;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }
}
