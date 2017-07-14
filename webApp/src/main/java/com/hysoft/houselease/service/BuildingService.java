package com.hysoft.houselease.service;

import com.hysoft.houselease.dto.HouseBuildingDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yulifan on 2017/6/6.
 */
public interface BuildingService {
  public List<HouseBuildingDto> getBuildingList(HouseBuildingDto buildingDto);
  public void insertBuilding(HouseBuildingDto buildingDto);
  public void updateBuilding(HouseBuildingDto buildingDto);
}
