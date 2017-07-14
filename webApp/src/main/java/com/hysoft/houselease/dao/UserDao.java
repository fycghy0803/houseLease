package com.hysoft.houselease.dao;

import com.hysoft.houselease.dto.HouseBuildingDto;
import com.hysoft.houselease.dto.HouseUserDto;

import java.util.List;

/**
 * Created by yulifan on 2017/6/5.
 */
public interface UserDao {
    public List<HouseUserDto> getUserList(HouseUserDto userDto);
    public void insertUser(HouseUserDto userDto);
    public void updateUserById(HouseUserDto userDto);
    public List<HouseUserDto> queryUser(String searchStr);
    public HouseUserDto getUserInfoByTel(HouseUserDto userDto);
}
