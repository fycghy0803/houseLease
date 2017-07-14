package com.hysoft.houselease.dao;

import com.hysoft.houselease.dto.HousePlaceDto;

import java.util.List;

/**
 * Created by yulifan on 2017/6/5.
 */
public interface PlaceDao {
    public List<HousePlaceDto> getPlaceList(HousePlaceDto placeDto);
    public void insertPlace(HousePlaceDto placeDto);
    public void updatePlace(HousePlaceDto placeDto);
    public List<HousePlaceDto> getToLeaseList(HousePlaceDto placeDto);
    public void updateQuitStatus(HousePlaceDto housePlaceDto);
    public HousePlaceDto selectByPrimaryKey(HousePlaceDto placeDto);
    public void updateLetCount(HousePlaceDto placeDto);
    public void updateLetCountQuit(HousePlaceDto placeDto);
}
