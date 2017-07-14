package com.hysoft.houselease.service.impl;

import com.hysoft.houselease.dao.UserDao;
import com.hysoft.houselease.dto.HouseUserDto;
import com.hysoft.houselease.service.UserService;
import com.hysoft.houselease.util.Consistent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yulifan on 2017/6/5.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
  @Autowired
  private UserDao userDao;

  public List<HouseUserDto> getUserList(HouseUserDto userDto) {
     List<HouseUserDto> userDtoList = userDao.getUserList(userDto);
     return userDtoList;
  }

  public void insertUser(HouseUserDto userDto) {
     userDao.insertUser(userDto);
  }

  public void updateUserById(HouseUserDto userDto) {
     userDao.updateUserById(userDto);
  }

  public List<HouseUserDto> queryUser(String searchStr) {
     List<HouseUserDto> userDtoList = userDao.queryUser(searchStr);
     return userDtoList;
  }

  public void insertOrGetUser(HouseUserDto userDto){
    HouseUserDto tmpDto = userDao.getUserInfoByTel(userDto);
    if(tmpDto == null) {
       userDto.setStatus(Consistent.STATUS_NORMAL);
       userDao.insertUser(userDto);
    } else {
       userDto.setHoId(tmpDto.getHoId());
    }
  }
}
