package com.hysoft.houselease.controller;

import com.hysoft.houselease.dto.HouseBuildingDto;
import com.hysoft.houselease.dto.HouseUserDto;
import com.hysoft.houselease.handler.BaseController;
import com.hysoft.houselease.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by yulifan on 2017/6/6.
 */

/**
 *
 */
@RestController
@RequestMapping("/building")
public class BuildingController extends BaseController{
    @Autowired
    BuildingService buildingService;

    @RequestMapping("/insertBuilding")
    public Map<String,Object> insertBuilding(HouseBuildingDto houseBuildingDto) throws Exception{
      buildingService.insertBuilding(houseBuildingDto);
      return handleResMap(houseBuildingDto);
    }

    @RequestMapping("/updateBuilding")
    public Map<String,Object> updateBuilding(HouseBuildingDto houseBuildingDto) throws Exception{
      buildingService.updateBuilding(houseBuildingDto);
      return handleResMap(houseBuildingDto);
    }

    @RequestMapping("getBuildingList")
    public Map<String,Object> getBuildingList(HouseBuildingDto houseBuildingDto) throws Exception {
      List<HouseBuildingDto> buildingDtoList  = buildingService.getBuildingList(houseBuildingDto);
      return handleResMap(buildingDtoList);
    }
}
