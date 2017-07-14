/**
 * Created by yulifan on 2017/6/20.
 */

insertPlaceInfo_url = "/place/insertPlace.action";

$(function(){
   $("#addPlaceForm").bootstrapValidator();
});

savePlaceInfo = function() {
    var data = $("#addPlaceForm").data('bootstrapValidator');
    var flag = data.validate().isValid();
    if(!flag) return;
    var url = insertPlaceInfo_url;
    var postData = $("#addPlaceForm").serialize();
    ajaxPost(url,postData,savePlaceInfo);
}

savePlaceInfo.ajaxSuccess = function(data) {
    if(data && data.ok)  {
       alert("增加房屋成功!");
       //window.location.href = window.location.href;
    } else {
       alert("增加房屋失败!");
    }
}
