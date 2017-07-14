package com.hysoft.houselease.service;

import com.hysoft.houselease.dto.HouseUserDto;

import java.util.List;

/**
 * Created by yulifan on 2017/6/5.
 */
public interface UserService {
   public List<HouseUserDto> getUserList(HouseUserDto userDto);
   public void insertUser(HouseUserDto userDto);
   public void updateUserById(HouseUserDto userDto);
   public List<HouseUserDto> queryUser(String searchStr);
   public void insertOrGetUser(HouseUserDto userDto);
}
