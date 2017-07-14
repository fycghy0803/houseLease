package com.hysoft.houselease.controller;

import com.hysoft.houselease.dao.PlaceDao;
import com.hysoft.houselease.dto.HouseBuildingDto;
import com.hysoft.houselease.dto.HousePlaceDto;
import com.hysoft.houselease.handler.BaseController;
import com.hysoft.houselease.service.BuildingService;
import com.hysoft.houselease.service.PlaceService;
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
@RequestMapping("/place")
public class PlaceController extends BaseController{
    @Autowired
    PlaceService placeService;

    @RequestMapping("/insertPlace")
    public Map<String,Object> insertPlace(HousePlaceDto housePlaceDto) throws Exception{
      placeService.insertPlace(housePlaceDto);
      return handleResMap(housePlaceDto);
    }

    @RequestMapping("/updatePlace")
    public Map<String,Object> updatePlace(HousePlaceDto housePlaceDto) throws Exception{
      placeService.updatePlace(housePlaceDto);
      return handleResMap(housePlaceDto);
    }

    @RequestMapping("/getPlaceList")
    public Map<String,Object> getPlaceList(HousePlaceDto housePlaceDto) throws Exception {
      List<HousePlaceDto> placeDtoList   = placeService.getPlaceList(housePlaceDto);
      return handleResMap(placeDtoList);
    }

    @RequestMapping("/getToLeasePlaceList")
    public Map<String,Object> getToLeasePlaceList(HousePlaceDto housePlaceDto) throws Exception {
       List<HousePlaceDto> placeDtoList   = placeService.getToLeaseList(housePlaceDto);
       return handleResMap(placeDtoList);
    }

    @RequestMapping("/updateQuitStatus")
    public Map<String,Object> updateQuitStatus(HousePlaceDto housePlaceDto) {
        placeService.updateQuitStatus(housePlaceDto);
        Map<String,Object> ret = handleResMap(housePlaceDto);
        return ret;
    }

   @RequestMapping("/getPlaceInfoById")
   public Map<String,Object> getPlaceInfoById(HousePlaceDto housePlaceDto) {
      HousePlaceDto placeDto = placeService.selectByPrimaryKey(housePlaceDto);
      Map<String,Object> ret = handleResMap(placeDto);
      return ret;
   }
}
