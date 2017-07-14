package com.hysoft.houselease.service.impl;

import com.hysoft.houselease.dao.PlaceDao;
import com.hysoft.houselease.dto.HouseHiredInfoDto;
import com.hysoft.houselease.dto.HousePlaceDto;
import com.hysoft.houselease.service.BuildingService;
import com.hysoft.houselease.service.HiredInfoService;
import com.hysoft.houselease.service.PlaceService;
import com.hysoft.houselease.service.UserService;
import com.hysoft.houselease.util.Consistent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by yulifan on 2017/6/6.
 */
@Service("placeService")
public class PlaceServiceImpl implements PlaceService {
   @Autowired
   private PlaceDao placeDao;
   @Autowired
   private UserService userService;
   @Autowired
   private BuildingService buildingService;
   @Autowired
   private HiredInfoService hiredInfoService;

   public List<HousePlaceDto> getPlaceList(HousePlaceDto placeDto) {
      List<HousePlaceDto> placeDtoList = placeDao.getPlaceList(placeDto);
      return placeDtoList;
   }

   public void insertPlace(HousePlaceDto placeDto) {
      //insert user info
      placeDto.getHouseUserDto().setUserType(new Integer(2));
      userService.insertOrGetUser(placeDto.getHouseUserDto());
      placeDto.setHoId(placeDto.getHouseUserDto().getHoId());

      //insert building
      buildingService.insertBuilding(placeDto.getHouseBuildingDto());

      //insert place
      placeDto.setStatus(Consistent.STATUS_NORMAL);
      placeDto.setLetCount(new Integer(0));
      placeDto.setHbId(placeDto.getHouseBuildingDto().getHbId());
      placeDao.insertPlace(placeDto);

      //insert hired info
      insertHiredInfo(placeDto);
   }

   public void insertHiredInfo(HousePlaceDto placeDto) {
       HouseHiredInfoDto houseHiredInfoDto = placeDto.getHouseHiredInfoDto();
       houseHiredInfoDto.setHpId(placeDto.getHpId());
       houseHiredInfoDto.setHuId(placeDto.getHoId());
       houseHiredInfoDto.setHireType(Consistent.USER_TYPE_OWNER);
       houseHiredInfoDto.setStatus(Consistent.STATUS_NORMAL);
       houseHiredInfoDto.setDeposit(placeDto.getDeposit());
       houseHiredInfoDto.setCreatedDate(new Date());
       houseHiredInfoDto.setStartDate(placeDto.getStartDate());
       houseHiredInfoDto.setEndDate(placeDto.getEndDate());
       houseHiredInfoDto.setRent(placeDto.getRent());
       houseHiredInfoDto.setRent(houseHiredInfoDto.getRent() * houseHiredInfoDto.getPayTerm());
       hiredInfoService.insertWithoutValid(houseHiredInfoDto);
   }

   public void updatePlace(HousePlaceDto placeDto) {
      placeDao.updatePlace(placeDto);
   }

   public List<HousePlaceDto> getToLeaseList(HousePlaceDto placeDto) {
     List<HousePlaceDto> placeDtoList = placeDao.getToLeaseList(placeDto);
     return placeDtoList;
   }

   public  void updateQuitStatus(HousePlaceDto housePlaceDto){
      placeDao.updateQuitStatus(housePlaceDto);
   }

   public HousePlaceDto selectByPrimaryKey(HousePlaceDto placeDto){
      HousePlaceDto housePlaceDto = placeDao.selectByPrimaryKey(placeDto);
      return housePlaceDto;
   }
}
