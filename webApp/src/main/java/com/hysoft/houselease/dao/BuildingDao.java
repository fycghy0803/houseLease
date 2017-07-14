package com.hysoft.houselease.dao;

import com.hysoft.houselease.dto.HouseBuildingDto;
import com.hysoft.houselease.dto.HouseUserDto;

import java.util.List;

/**
 * Created by yulifan on 2017/6/5.
 */
public interface BuildingDao {
  public List<HouseBuildingDto> getBuildingList(HouseBuildingDto buildingDto);
  public void insertBuilding(HouseBuildingDto buildingDto);
  public void updateBuilding(HouseBuildingDto buildingDto);

}
