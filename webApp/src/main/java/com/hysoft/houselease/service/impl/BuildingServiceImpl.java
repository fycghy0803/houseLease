package com.hysoft.houselease.service.impl;

import com.hysoft.houselease.dao.BuildingDao;
import com.hysoft.houselease.dao.PlaceDao;
import com.hysoft.houselease.dto.HouseBuildingDto;
import com.hysoft.houselease.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yulifan on 2017/6/6.
 */
@Service("buildingService")
public class BuildingServiceImpl implements BuildingService{
  @Autowired
  private BuildingDao buildingDao;

  public List<HouseBuildingDto> getBuildingList(HouseBuildingDto buildingDto) {
     List<HouseBuildingDto> buildingDtoList = buildingDao.getBuildingList(buildingDto);
     return buildingDtoList;
  }

  public void insertBuilding(HouseBuildingDto buildingDto) {
    buildingDao.insertBuilding(buildingDto);
  }

  public void updateBuilding(HouseBuildingDto buildingDto) {
     buildingDao.updateBuilding(buildingDto);
  }
}
