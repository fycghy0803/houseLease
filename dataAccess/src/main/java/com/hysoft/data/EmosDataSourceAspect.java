package com.hysoft.data;

import org.aspectj.lang.JoinPoint;

import java.util.regex.Pattern;

/**
 * Created by yulifan on 16/7/11.
 */
public class EmosDataSourceAspect{
    private final String slaveDataSource = "slave";
    private final String masterDataSource = "master";
    private final Pattern pattern = Pattern.compile("get*|select*|query*");

    public void before(JoinPoint point){
        String methodName = point.getSignature().getName();
        if(pattern.matcher(methodName).find()) {
            HandleDataSource.setDataSource(slaveDataSource);
        } else{
            HandleDataSource.setDataSource(masterDataSource);
        }
    }
}
