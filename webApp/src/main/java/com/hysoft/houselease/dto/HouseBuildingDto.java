package com.hysoft.houselease.dto;

/**
 * Created by yulifan on 2017/6/2.
 */
public class HouseBuildingDto extends BaseDto{
   private Integer hbId;
   private Integer belongProv;
   private Integer belongCity;
   private Integer belongDistrict;
   private String buildingAddress;
   private String buildingName;

   public Integer getHbId() {
    return hbId;
   }

   public void setHbId(Integer hbId) {
    this.hbId = hbId;
   }

   public Integer getBelongProv() {
    return belongProv;
   }

   public void setBelongProv(Integer belongProv) {
    this.belongProv = belongProv;
   }

   public Integer getBelongCity() {
     return belongCity;
   }

   public void setBelongCity(Integer belongCity) {
     this.belongCity = belongCity;
   }

  public Integer getBelongDistrict() {
    return belongDistrict;
  }

  public void setBelongDistrict(Integer belongDistrict) {
    this.belongDistrict = belongDistrict;
  }

  public String getBuildingAddress() {
    return buildingAddress;
  }

  public void setBuildingAddress(String buildingAddress) {
    this.buildingAddress = buildingAddress;
  }

  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }
}
