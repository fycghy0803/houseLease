package com.hysoft.houselease.handler;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yulifan on 2017/3/17.
 */
@ControllerAdvice
public class EmosExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Map<String,Object> handleException(Exception e,HttpServletRequest model) {
       e.printStackTrace();
       Map<String,Object> resultMap = new HashMap<String,Object>();
       String errMsg = e.getMessage();
       errMsg = errMsg == null ? (String)model.getAttribute(BaseController.ERROR) : errMsg;
       errMsg = errMsg == null ? "调用失败,请稍后重试":errMsg;
       resultMap.put("ok",false);
       resultMap.put("message", errMsg);
       resultMap.put("res", "");
       return resultMap;
    }
}
