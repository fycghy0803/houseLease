package com.hysoft.houselease.dao;

import com.hysoft.houselease.dto.HouseHiredInfoDto;

import java.util.List;

public interface HiredInfoDao {
    int deleteByPrimaryKey(Integer hhiId);
    int insert(HouseHiredInfoDto record);
    int insertSelective(HouseHiredInfoDto record);
    HouseHiredInfoDto selectByPrimaryKey(Integer hhiId);
    int updateByPrimaryKeySelective(HouseHiredInfoDto record);
    int updateByPrimaryKey(HouseHiredInfoDto record);
    List<HouseHiredInfoDto> getHiredInfoList(HouseHiredInfoDto hiredInfoDto);
    List<HouseHiredInfoDto> getToPayHiredInfoList(HouseHiredInfoDto hiredInfoDto);
    void updateNextPayDate(HouseHiredInfoDto hiredInfoDto);
    void updateQuitStatus(HouseHiredInfoDto hiredInfoDto);
}
