package com.hysoft.houselease.controller;

import com.hysoft.houselease.dto.HouseHiredInfoDto;
import com.hysoft.houselease.dto.HousePlaceDto;
import com.hysoft.houselease.dto.HouseUserDto;
import com.hysoft.houselease.handler.BaseController;
import com.hysoft.houselease.service.HiredInfoService;
import com.hysoft.houselease.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by yulifan on 2017/6/5.
 */
@RestController
@RequestMapping("/hiredInfo")
public class HiredInfoController extends BaseController{
   @Autowired
   private HiredInfoService hiredInfoService;

   @RequestMapping("/insertHiredInfo")
   public Map<String,Object> insertUser(HouseHiredInfoDto hiredInfoDto) throws Exception{
       hiredInfoService.insertHiredInfo(hiredInfoDto);
       return handleResMap(hiredInfoDto);
   }

   @RequestMapping("/updateHiredInfo")
   public Map<String,Object> updateUser(HouseHiredInfoDto hiredInfoDto) throws Exception{
     hiredInfoService.updateHiredInfo(hiredInfoDto);
     return handleResMap(hiredInfoDto);
   }

   @RequestMapping("/getHiredInfoList")
   public Map<String,Object> getUserList(HouseHiredInfoDto hiredInfoDto) throws Exception {
      List<HouseHiredInfoDto> dtoList = hiredInfoService.getHiredInfoList(hiredInfoDto);
      return handleResMap(dtoList);
   }

   @RequestMapping("/queryHiredInfo")
   public Map<String,Object> queryUser(HouseHiredInfoDto hiredInfoDto) throws Exception {
      List<HouseHiredInfoDto> dtoList = hiredInfoService.getHiredInfoList(hiredInfoDto);
      return handleResMap(dtoList);
   }

   @RequestMapping("/getToPayHiredInfo")
   public Map<String,Object> getToPayHiredInfo(HouseHiredInfoDto hiredInfoDto) throws Exception {
      List<HouseHiredInfoDto> dtoList = hiredInfoService.getToPayHiredInfoList(hiredInfoDto);
      Map<String,Object> ret = handleResMap(dtoList);
      return ret;
   }

   @RequestMapping("/updateNextPayDate")
   public Map<String,Object> updateNextPayDate(HouseHiredInfoDto hiredInfoDto) throws Exception {
       hiredInfoService.updateNextPayDate(hiredInfoDto);
       Map<String,Object> ret = handleResMap(hiredInfoDto);
       return ret;
   }

  @RequestMapping("/updateQuitStatus")
  public Map<String,Object> updateQuitStatus(HouseHiredInfoDto houseHiredInfoDto,String quitType) {
      hiredInfoService.updateQuitStatus(houseHiredInfoDto,quitType);
      Map<String,Object> ret = handleResMap(houseHiredInfoDto);
      return ret;
  }
}
