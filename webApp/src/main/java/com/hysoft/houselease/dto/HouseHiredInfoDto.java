package com.hysoft.houselease.dto;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HouseHiredInfoDto extends BaseDto{
    private Integer hhiId;
    private Integer hpId;
    private Integer huId;
    private String hireType;
    private Integer hireCount;
    private String hireRoomType;
    private String hireRoomArea;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private Integer rent;
    private String payType;
    private Integer payTerm;
    private Integer deposit;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdDate;
    private Integer createdBy;
    private String memo;
    private Integer prewarnDays;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startWarnDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date nextPayDate;
    private HouseUserDto houseUserDto;
    private HouseBuildingDto houseBuildingDto;
    private HousePlaceDto housePlaceDto;
    private String place;

    public String getPlace() {
      return place;
    }

    public void setPlace(String place) {
      this.place = place;
    }

  public HouseBuildingDto getHouseBuildingDto() {
    return houseBuildingDto;
  }

  public void setHouseBuildingDto(HouseBuildingDto houseBuildingDto) {
    this.houseBuildingDto = houseBuildingDto;
  }

  public HousePlaceDto getHousePlaceDto() {
    return housePlaceDto;
  }

  public void setHousePlaceDto(HousePlaceDto housePlaceDto) {
    this.housePlaceDto = housePlaceDto;
  }

  public HouseUserDto getHouseUserDto() {
    return houseUserDto;
  }

  public void setHouseUserDto(HouseUserDto houseUserDto) {
    this.houseUserDto = houseUserDto;
  }





  public Integer getPrewarnDays() {
    return prewarnDays;
  }

  public void setPrewarnDays(Integer prewarnDays) {
    this.prewarnDays = prewarnDays;
  }

  public Date getStartWarnDate() {
    return startWarnDate;
  }

  public void setStartWarnDate(Date startWarnDate) {
    this.startWarnDate = startWarnDate;
  }

  public Date getNextPayDate() {
    return nextPayDate;
  }

  public void setNextPayDate(Date nextPayDate) {
    this.nextPayDate = nextPayDate;
  }




    public Integer getHhiId() {
        return hhiId;
    }

    public void setHhiId(Integer hhiId) {
        this.hhiId = hhiId;
    }

    public Integer getHpId() {
        return hpId;
    }

    public void setHpId(Integer hpId) {
        this.hpId = hpId;
    }

    public Integer getHuId() {
        return huId;
    }

    public void setHuId(Integer huId) {
        this.huId = huId;
    }

    public String getHireType() {
        return hireType;
    }

    public void setHireType(String hireType) {
        this.hireType = hireType == null ? null : hireType.trim();
    }

    public Integer getHireCount() {
        return hireCount;
    }

    public void setHireCount(Integer hireCount) {
        this.hireCount = hireCount;
    }

    public String getHireRoomType() {
        return hireRoomType;
    }

    public void setHireRoomType(String hireRoomType) {
        this.hireRoomType = hireRoomType == null ? null : hireRoomType.trim();
    }

    public String getHireRoomArea() {
        return hireRoomArea;
    }

    public void setHireRoomArea(String hireRoomArea) {
        this.hireRoomArea = hireRoomArea;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Integer getPayTerm() {
        return payTerm;
    }

    public void setPayTerm(Integer payTerm) {
        this.payTerm = payTerm;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}
