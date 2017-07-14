package com.hysoft.houselease.service;

import com.hysoft.houselease.dto.HouseBuildingDto;
import com.hysoft.houselease.dto.HouseHiredInfoDto;

import java.util.List;

/**
 * Created by yulifan on 2017/6/7.
 */
public interface HiredInfoService {
   public List<HouseHiredInfoDto> getHiredInfoList(HouseHiredInfoDto hiredInfoDto);
   public void insertHiredInfo(HouseHiredInfoDto hiredInfoDto);
   public void updateHiredInfo(HouseHiredInfoDto hiredInfoDto);
   public List<HouseHiredInfoDto> getToPayHiredInfoList(HouseHiredInfoDto hiredInfoDto);
   public void updatePayRent(HouseHiredInfoDto hiredInfoDto);
  void updateNextPayDate(HouseHiredInfoDto hiredInfoDto);
  void updateQuitStatus(HouseHiredInfoDto hiredInfoDto,String quitType);
  public void insertWithoutValid(HouseHiredInfoDto hiredInfoDto);
}
