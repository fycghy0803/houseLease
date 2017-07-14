package com.hysoft.houselease.dto;

import java.util.Date;

/**
 * Created by yulifan on 2017/6/2.
 */
public class HousePlaceDto extends BaseDto{
  private Integer hpId;
  private String  hpCode;
  private Integer hbId;
  private Integer hoId;
  private Integer freeTerm;
  private Date    startDate;
  private Date    endDate;
  private String  buildingNumber;
  private String  unitNumber;
  private String  floorNumber;
  private String  roomNumber;
  private Integer roomCount;
  private String  placeType;
  private Integer hasHeating;
  private Integer hasGas;
  private String  decoLevel;
  private Integer hasInternet;
  private Integer hasBeds;
  private Integer hasHotwater;
  private Integer hasTvs;
  private Integer hasAirs;
  private Integer hasWashers;
  private Integer hasFridges;
  private Integer proportion;
  private Integer rental;
  private String  rentPayType;
  private Integer rentPayTerm;
  private Integer deposit;
  private Date    lastRentPayDate;
  private Integer propertyFee;
  private Integer propertyPayTerm;
  private Date    lastPropayDate;
  private Integer waterRate;
  private Integer waterRateTerm;
  private Date    lastWaterPayDate;
  private Integer powerRate;
  private Integer powerRateTerm;
  private Date    lastPowerPayDate;
  private Integer gasRate;
  private Integer gasRateTerm;
  private Date    lastGasPayDate;
  private String  status;
  private Integer letCount;
  private String  otherFacilities;
  private Date    createdDate;
  private Integer createdBy;
  private String keyWords;
  private String place;
  private HouseBuildingDto houseBuildingDto;
  private HouseUserDto houseUserDto;
  private String hireRoomArea;
  private Integer areas;
  private Integer rent;
  private Integer hasKeys;
  private Integer hasSofas;
  private  Integer hasTables;
  private Integer hasTeapoy;
  private HouseHiredInfoDto houseHiredInfoDto;
  private Date lastPropPayDate;
  private String powerNumber;
  private String waterNumber;
  private String gasNumber;
  private String warnNumber;
  private String tvNumber;
  private String internetNumber;

  public Date getLastPropPayDate() {
    return lastPropPayDate;
  }

  public void setLastPropPayDate(Date lastPropPayDate) {
    this.lastPropPayDate = lastPropPayDate;
  }

  public String getPowerNumber() {
    return powerNumber;
  }

  public void setPowerNumber(String powerNumber) {
    this.powerNumber = powerNumber;
  }

  public String getWaterNumber() {
    return waterNumber;
  }

  public void setWaterNumber(String waterNumber) {
    this.waterNumber = waterNumber;
  }

  public String getGasNumber() {
    return gasNumber;
  }

  public void setGasNumber(String gasNumber) {
    this.gasNumber = gasNumber;
  }

  public String getWarnNumber() {
    return warnNumber;
  }

  public void setWarnNumber(String warnNumber) {
    this.warnNumber = warnNumber;
  }

  public String getTvNumber() {
    return tvNumber;
  }

  public void setTvNumber(String tvNumber) {
    this.tvNumber = tvNumber;
  }

  public String getInternetNumber() {
    return internetNumber;
  }

  public void setInternetNumber(String internetNumber) {
    this.internetNumber = internetNumber;
  }

  public Integer getHasTables() {
    return hasTables;
  }

  public void setHasTables(Integer hasTables) {
    this.hasTables = hasTables;
  }

  public Integer getHasTeapoy() {
    return hasTeapoy;
  }

  public void setHasTeapoy(Integer hasTeapoy) {
    this.hasTeapoy = hasTeapoy;
  }

  public Integer getHasSofas() {
    return hasSofas;
  }

  public void setHasSofas(Integer hasSofas) {
    this.hasSofas = hasSofas;
  }

  public Integer getHasKeys() {
    return hasKeys;
  }

  public void setHasKeys(Integer hasKeys) {
    this.hasKeys = hasKeys;
  }

  public HouseHiredInfoDto getHouseHiredInfoDto() {
    return houseHiredInfoDto;
  }

  public void setHouseHiredInfoDto(HouseHiredInfoDto houseHiredInfoDto) {
    this.houseHiredInfoDto = houseHiredInfoDto;
  }

  public Integer getRent() {
    return rent;
  }

  public void setRent(Integer rent) {
    this.rent = rent;
  }

  public Integer getAreas() {
    return areas;
  }

  public void setAreas(Integer areas) {
    this.areas = areas;
  }

  public String getHireRoomArea() {
    return hireRoomArea;
  }

  public void setHireRoomArea(String hireRoomArea) {
    this.hireRoomArea = hireRoomArea;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public HouseUserDto getHouseUserDto() {
    return houseUserDto;
  }

  public void setHouseUserDto(HouseUserDto houseUserDto) {
    this.houseUserDto = houseUserDto;
  }

  public HouseBuildingDto getHouseBuildingDto() {
    return houseBuildingDto;
  }

  public void setHouseBuildingDto(HouseBuildingDto houseBuildingDto) {
    this.houseBuildingDto = houseBuildingDto;
  }

  public String getKeyWords() {
    return keyWords;
  }

  public void setKeyWords(String keyWords) {
    this.keyWords = keyWords;
  }

  public Integer getHpId() {
    return hpId;
  }

  public void setHpId(Integer hpId) {
    this.hpId = hpId;
  }

  public String getHpCode() {
    return hpCode;
  }

  public void setHpCode(String hpCode) {
    this.hpCode = hpCode;
  }

  public Integer getHbId() {
    return hbId;
  }

  public void setHbId(Integer hbId) {
    this.hbId = hbId;
  }

  public Integer getHoId() {
    return hoId;
  }

  public void setHoId(Integer hoId) {
    this.hoId = hoId;
  }

  public Integer getFreeTerm() {
    return freeTerm;
  }

  public void setFreeTerm(Integer freeTerm) {
    this.freeTerm = freeTerm;
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

  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public String getFloorNumber() {
    return floorNumber;
  }

  public void setFloorNumber(String floorNumber) {
    this.floorNumber = floorNumber;
  }

  public String getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Integer getRoomCount() {
    return roomCount;
  }

  public void setRoomCount(Integer roomCount) {
    this.roomCount = roomCount;
  }

  public String getPlaceType() {
    return placeType;
  }

  public void setPlaceType(String placeType) {
    this.placeType = placeType;
  }

  public Integer getHasHeating() {
    return hasHeating;
  }

  public void setHasHeating(Integer hasHeating) {
    this.hasHeating = hasHeating;
  }

  public Integer getHasGas() {
    return hasGas;
  }

  public void setHasGas(Integer hasGas) {
    this.hasGas = hasGas;
  }

  public String getDecoLevel() {
    return decoLevel;
  }

  public void setDecoLevel(String decoLevel) {
    this.decoLevel = decoLevel;
  }

  public Integer getHasInternet() {
    return hasInternet;
  }

  public void setHasInternet(Integer hasInternet) {
    this.hasInternet = hasInternet;
  }

  public Integer getHasBeds() {
    return hasBeds;
  }

  public void setHasBeds(Integer hasBeds) {
    this.hasBeds = hasBeds;
  }

  public Integer getHasHotwater() {
    return hasHotwater;
  }

  public void setHasHotwater(Integer hasHotwater) {
    this.hasHotwater = hasHotwater;
  }

  public Integer getHasTvs() {
    return hasTvs;
  }

  public void setHasTvs(Integer hasTvs) {
    this.hasTvs = hasTvs;
  }

  public Integer getHasAirs() {
    return hasAirs;
  }

  public void setHasAirs(Integer hasAirs) {
    this.hasAirs = hasAirs;
  }

  public Integer getHasWashers() {
    return hasWashers;
  }

  public void setHasWashers(Integer hasWashers) {
    this.hasWashers = hasWashers;
  }

  public Integer getHasFridges() {
    return hasFridges;
  }

  public void setHasFridges(Integer hasFridges) {
    this.hasFridges = hasFridges;
  }

  public Integer getProportion() {
    return proportion;
  }

  public void setProportion(Integer proportion) {
    this.proportion = proportion;
  }

  public Integer getRental() {
    return rental;
  }

  public void setRental(Integer rental) {
    this.rental = rental;
  }

  public String getRentPayType() {
    return rentPayType;
  }

  public void setRentPayType(String rentPayType) {
    this.rentPayType = rentPayType;
  }

  public Integer getRentPayTerm() {
    return rentPayTerm;
  }

  public void setRentPayTerm(Integer rentPayTerm) {
    this.rentPayTerm = rentPayTerm;
  }

  public Integer getDeposit() {
    return deposit;
  }

  public void setDeposit(Integer deposit) {
    this.deposit = deposit;
  }

  public Date getLastRentPayDate() {
    return lastRentPayDate;
  }

  public void setLastRentPayDate(Date lastRentPayDate) {
    this.lastRentPayDate = lastRentPayDate;
  }

  public Integer getPropertyFee() {
    return propertyFee;
  }

  public void setPropertyFee(Integer propertyFee) {
    this.propertyFee = propertyFee;
  }

  public Integer getPropertyPayTerm() {
    return propertyPayTerm;
  }

  public void setPropertyPayTerm(Integer propertyPayTerm) {
    this.propertyPayTerm = propertyPayTerm;
  }

  public Date getLastPropayDate() {
    return lastPropayDate;
  }

  public void setLastPropayDate(Date lastPropayDate) {
    this.lastPropayDate = lastPropayDate;
  }

  public Integer getWaterRate() {
    return waterRate;
  }

  public void setWaterRate(Integer waterRate) {
    this.waterRate = waterRate;
  }

  public Integer getWaterRateTerm() {
    return waterRateTerm;
  }

  public void setWaterRateTerm(Integer waterRateTerm) {
    this.waterRateTerm = waterRateTerm;
  }

  public Date getLastWaterPayDate() {
    return lastWaterPayDate;
  }

  public void setLastWaterPayDate(Date lastWaterPayDate) {
    this.lastWaterPayDate = lastWaterPayDate;
  }

  public Integer getPowerRate() {
    return powerRate;
  }

  public void setPowerRate(Integer powerRate) {
    this.powerRate = powerRate;
  }

  public Integer getPowerRateTerm() {
    return powerRateTerm;
  }

  public void setPowerRateTerm(Integer powerRateTerm) {
    this.powerRateTerm = powerRateTerm;
  }

  public Date getLastPowerPayDate() {
    return lastPowerPayDate;
  }

  public void setLastPowerPayDate(Date lastPowerPayDate) {
    this.lastPowerPayDate = lastPowerPayDate;
  }

  public Integer getGasRate() {
    return gasRate;
  }

  public void setGasRate(Integer gasRate) {
    this.gasRate = gasRate;
  }

  public Integer getGasRateTerm() {
    return gasRateTerm;
  }

  public void setGasRateTerm(Integer gasRateTerm) {
    this.gasRateTerm = gasRateTerm;
  }

  public Date getLastGasPayDate() {
    return lastGasPayDate;
  }

  public void setLastGasPayDate(Date lastGasPayDate) {
    this.lastGasPayDate = lastGasPayDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getLetCount() {
    return letCount;
  }

  public void setLetCount(Integer letCount) {
    this.letCount = letCount;
  }

  public String getOtherFacilities() {
    return otherFacilities;
  }

  public void setOtherFacilities(String otherFacilities) {
    this.otherFacilities = otherFacilities;
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
}
