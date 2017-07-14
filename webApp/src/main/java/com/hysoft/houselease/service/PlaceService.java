package com.hysoft.houselease.service;

import com.hysoft.houselease.dto.HousePlaceDto;

import java.util.List;

/**
 * Created by yulifan on 2017/6/6.
 */
public interface PlaceService {
   public List<HousePlaceDto> getPlaceList(HousePlaceDto placeDto);
   public void insertPlace(HousePlaceDto placeDto);
   public void updatePlace(HousePlaceDto placeDto);
   public List<HousePlaceDto> getToLeaseList(HousePlaceDto placeDto);
   void updateQuitStatus(HousePlaceDto housePlaceDto);
   public HousePlaceDto selectByPrimaryKey(HousePlaceDto placeDto);
}
