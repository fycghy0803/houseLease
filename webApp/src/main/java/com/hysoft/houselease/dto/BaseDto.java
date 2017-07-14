package com.hysoft.houselease.dto;

import java.util.Date;

/**
 * Created by yulifan on 2017/6/2.
 */
public class BaseDto {
   protected Date createdDate;
   protected Integer createdBy;
   protected int pageIndex;
   protected int pageSize;
  protected String showAll = "N";

  public String getShowAll() {
    return showAll;
  }

  public void setShowAll(String showAll) {
    this.showAll = showAll;
  }

  public int getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(int pageIndex) {
    this.pageIndex = pageIndex;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public Date getCreatedDate() {
    return createdDate;
   }

   public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
   }

   public Integer getCreatedBy() {
    return createdBy;
   }

   public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
   }
}
