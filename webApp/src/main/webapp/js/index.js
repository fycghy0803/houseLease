/**
 * Created by yulifan on 2017/6/14.
 */

getTodoList_url =  "hiredInfo/getToPayHiredInfo.action";
getToLeaseList_url = "place/getToLeasePlaceList.action";
updateNextPayDate_url = "hiredInfo/updateNextPayDate.action";
updateQuitStatus_url = "hiredInfo/updateQuitStatus.action";
updatePlaceQuitStatus_url = "place/updateQuitStatus.action";
g_custom_type = "custom";
g_owner_type = "owner";

$(function(){
    getTodoList("normal");
    getToLeaseList("normal");
    initSearch("#getSearch","#getTable");
    initSearch("#paySearch","#payTable");
    initSearch("#leaseSearch","#leaseTable");
});

function refresh(){
   $("#getBody").empty();
   $("#payBody").empty();
   $("#toLeaseBody").empty();
   $("#toGet").html(0);
   $("#toPay").html(0);

   $("input[type=checkbox]").attr("checked",false);
   getTodoList("normal");
   getToLeaseList("normal");
}

function initSearch(inputObj,tableObj) {
  $(inputObj).keyup(function(){
    $(tableObj + " tbody tr")
      .hide()
      .filter(":contains('"+( $(this).val() )+"')")
      .show();
  }).keyup();
}

getTodoList = function(status,hireType,showAll) {
    var url = getTodoList_url;
    var postData = "";
    status && (postData = postData + "&status=" + status);
    hireType && (postData = postData + "&hireType=" + hireType);
    showAll && (postData = postData + "&showAll=" + showAll);
    ajaxPost(url,postData,getTodoList);
};

getTodoList.ajaxSuccess = function(data) {
   if(data && data.ok) {
       var getMes = $("#toGetTemplete").html();
       var payMes = $("#toPayTemplete").html();

       var res,getCount = 0,payCount = 0,leaseCount = 0;
       $.each(data.res,function(index,rec){
          if(rec.hireType == "custom") {
             res = transferMes(getMes,rec);
             $("#getBody").append(res);
             getCount++;
          } else {
             res = transferMes(payMes,rec);
             $("#payBody").append(res);
             payCount++;
          }
       });

       $("#toGet").html(getCount);
       $("#toPay").html(payCount);
   } else {
      alert("get data error!");
   }
};

getToLeaseList = function(status,showAll) {
   var url = getToLeaseList_url;
   var postData = "";
   status && (postData = "status=" + status);
   showAll && (postData = postData + "&showAll=" + showAll);
   ajaxPost(url,postData,getToLeaseList);
};

getToLeaseList.ajaxSuccess = function(data) {
   if(data && data.ok) {
      var leaseMes = $("#toLeaseTemplete").html();
      var res,leaseCount = 0;
      $.each(data.res,function(index,rec){
         res = transferMes(leaseMes,rec);
         $("#toLeaseBody").append(res);
         leaseCount++;
      });
      $("#toLease").html(leaseCount);
   } else {
      alert("get data error!");
   }
}

var g_currentTr,g_updateType;

updateNextPayDate = function(trObj,hhiId,updateType){
    var url =  updateNextPayDate_url;
    g_updateType = updateType;
    g_currentTr = $(trObj).parent().parent();
    var postData = "hhiId=" + hhiId;
    ajaxPost(url,postData,updateNextPayDate);
};

updateNextPayDate.ajaxSuccess = function(data) {
   if(data && data.ok) {
       g_currentTr.remove();
       var obj = g_updateType == g_custom_type ? $("#toGet"):$("#toPay");
       obj.html(parseInt(obj.html()) -1);
   } else {
       alert("update failure!");
   }
};

updateQuitStatus = function(trObj,hhiId,quitType,hpId){
    var url =  updateQuitStatus_url;
    g_updateType = quitType;
    g_currentTr = $(trObj).parent().parent();
    var postData = "hhiId=" + hhiId + "&quitType=" + quitType;
    if(hpId) {
      postData = postData + "&hpId=" + hpId;
    };
    ajaxPost(url,postData,updateQuitStatus);
}

updateQuitStatus.ajaxSuccess = function(data) {
   if(data && data.ok) {
      g_currentTr.find(".status").html("quit");
   } else {
      alert("update failure!");
   }
}

updatePlaceQuitStatus = function(trObj,hpId) {
   var url = updatePlaceQuitStatus_url;
   var postData = "&hpId=" + hpId;
   g_currentTr = $(trObj).parent().parent();
   ajaxPost(url,postData,updatePlaceQuitStatus);
}


updatePlaceQuitStatus.ajaxSuccess = function(data) {
  if(data && data.ok) {
     g_currentTr.find(".status").html("quit");
  } else {
    alert("update failure!");
  }
}

function showOrNoAll(hireType,checked) {
     var status = "normal",showAll = "N";
     checked && (status = "");
     checked && (showAll = "Y");

     if(hireType == g_custom_type) {
       $("#getBody").empty();
     } else {
       $("#payBody").empty();
     }

     getTodoList(status,hireType,showAll);
}

function showOrNoAllPlace(checked) {
   var status = "normal";
   var showAll = "N";
   checked && (showAll = "Y");
   checked && (status = "");
   $("#toLeaseBody").empty();
   getToLeaseList(status,showAll);
}
