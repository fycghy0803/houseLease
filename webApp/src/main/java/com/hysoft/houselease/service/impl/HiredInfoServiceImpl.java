package com.hysoft.houselease.service.impl;

import com.hysoft.houselease.dao.HiredInfoDao;
import com.hysoft.houselease.dao.PlaceDao;
import com.hysoft.houselease.dao.UserDao;
import com.hysoft.houselease.dto.HouseHiredInfoDto;
import com.hysoft.houselease.dto.HousePlaceDto;
import com.hysoft.houselease.dto.HouseUserDto;
import com.hysoft.houselease.service.HiredInfoService;
import com.hysoft.houselease.service.UserService;
import com.hysoft.houselease.util.Consistent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by yulifan on 2017/6/7.
 */
@Service("hiredInfoService")
public class HiredInfoServiceImpl implements  HiredInfoService {
  @Autowired
  private HiredInfoDao hiredInfoDao;
  @Autowired
  private PlaceDao placeDao;
  @Autowired
  private UserService userService;

  public List<HouseHiredInfoDto> getHiredInfoList(HouseHiredInfoDto hiredInfoDto) {
    List<HouseHiredInfoDto>  hiredInfoDtoList = hiredInfoDao.getHiredInfoList(hiredInfoDto);
     return hiredInfoDtoList;
  }

  public void insertHiredInfo(HouseHiredInfoDto hiredInfoDto) {
      //insert user info
      hiredInfoDto.getHouseUserDto().setUserType(new Integer(1));
      userService.insertOrGetUser(hiredInfoDto.getHouseUserDto());

      //insert into hired info
      hiredInfoDto.setHuId(hiredInfoDto.getHouseUserDto().getHoId());
      hiredInfoDto.setStatus(Consistent.STATUS_NORMAL);
      hiredInfoDto.setHireType(Consistent.USER_TYPE_CUSTOM);
      hiredInfoDto.setCreatedDate(new Date());
      hiredInfoDto.setRent(hiredInfoDto.getRent() * hiredInfoDto.getPayTerm());
      hiredInfoDao.insert(hiredInfoDto);

      //update for adding count of place's rent
      HousePlaceDto placeDto = new HousePlaceDto();
      placeDto.setLetCount(hiredInfoDto.getHireCount());
      placeDto.setHpId(hiredInfoDto.getHpId());
      placeDto.setHireRoomArea(hiredInfoDto.getHireRoomArea());
      placeDao.updateLetCount(placeDto);
  }

  public void updateHiredInfo(HouseHiredInfoDto hiredInfoDto) {
     hiredInfoDao.updateByPrimaryKeySelective(hiredInfoDto);
  }

  public List<HouseHiredInfoDto> getToPayHiredInfoList(HouseHiredInfoDto hiredInfoDto) {
      List<HouseHiredInfoDto>  hiredInfoDtoList = hiredInfoDao.getToPayHiredInfoList(hiredInfoDto);
      return hiredInfoDtoList;
  }

  public void updatePayRent(HouseHiredInfoDto hiredInfoDto) {

  }

  public void updateNextPayDate(HouseHiredInfoDto hiredInfoDto){
      hiredInfoDao.updateNextPayDate(hiredInfoDto);
  }

  public void updateQuitStatus(HouseHiredInfoDto hiredInfoDto,String quitType){
      HousePlaceDto housePlaceDto = new HousePlaceDto();
      if(!Consistent.USER_TYPE_CUSTOM.equals(quitType)) {
          housePlaceDto.setHpId(hiredInfoDto.getHpId());
          placeDao.updateQuitStatus(housePlaceDto);
      } else {
          HouseHiredInfoDto tmpInfoDto = hiredInfoDao.selectByPrimaryKey(hiredInfoDto.getHhiId());
          if(Consistent.STATUS_NORMAL.equals(tmpInfoDto.getStatus())) {
            housePlaceDto.setHpId(tmpInfoDto.getHpId());
            housePlaceDto.setLetCount(tmpInfoDto.getHireCount());
            housePlaceDto.setHireRoomArea("," + tmpInfoDto.getHireRoomArea());
            placeDao.updateLetCountQuit(housePlaceDto);
          }
      }

      hiredInfoDao.updateQuitStatus(hiredInfoDto);
  }

  public void insertWithoutValid(HouseHiredInfoDto hiredInfoDto) {
      hiredInfoDao.insert(hiredInfoDto);
  }
}
