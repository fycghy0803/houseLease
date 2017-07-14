package com.hysoft.houselease.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hysoft.houselease.dto.BaseDto;
import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/base")
public class BaseController {
    public final static String ERROR = "error";

    public  Map<String ,Object> handleResMap(boolean isSuccess,String resultMsg,Object resObj) {
        Map<String ,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("ok",isSuccess);
        resultMap.put("message", resultMsg);
        resultMap.put("res", resObj);
        return resultMap;
    }

    public  Map<String ,Object> handleResMap(String resultMsg,Object resObj) {
        Map<String ,Object> resultMap = handleResMap(true,resultMsg,resObj);
        return resultMap;
    }

    public  Map<String ,Object> handleResMap(Object resObj) {
        Map<String ,Object> resultMap = handleResMap("",resObj);
        return resultMap;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
