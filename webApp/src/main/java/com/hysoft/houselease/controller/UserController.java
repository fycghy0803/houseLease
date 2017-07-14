package com.hysoft.houselease.controller;

import com.hysoft.houselease.dto.HouseUserDto;
import com.hysoft.houselease.handler.BaseController;
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
@RequestMapping("/user")
public class UserController extends BaseController{
   @Autowired
   private UserService userService;

   @RequestMapping("/insertUser")
   public Map<String,Object> insertUser(HouseUserDto userDto) throws Exception{
       userService.insertUser(userDto);
       return handleResMap(userDto);
   }

   @RequestMapping("updateUser")
   public Map<String,Object> updateUser(HouseUserDto houseUserDto) throws Exception{
     userService.updateUserById(houseUserDto);
     return handleResMap(houseUserDto);
   }

   @RequestMapping("getUserList")
   public Map<String,Object> getUserList(HouseUserDto houseUserDto) throws Exception {
     List<HouseUserDto> userDtoList = userService.getUserList(houseUserDto);
     Map<String,Object> res = handleResMap(userDtoList);
     return res;
   }

   @RequestMapping("queryUser")
   public Map<String,Object> queryUser(HouseUserDto houseUserDto) throws Exception {
     String searchStr = houseUserDto.getUserName();
     List<HouseUserDto> userDtoList = userService.queryUser(searchStr);
     return handleResMap(userDtoList);
   }
}
