var CURRENT_PAGE = 1;
var currentVideoType = 1;
var SYSTEM_VIDEO = 1;
var USER_VIDEO = 2;
var IMAGE_TYPE = 3;
var TEXT_TYPE = 4;
var TOTAL_PAGE = 0;

function isMail(mailVal) {
    var Regex = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
    return Regex.test(mailVal);
}
function isNum(numVal){
    var Regex = /^\d{4}$/;
    return Regex.test(numVal);
}
function isName(nameVal){
    var Regex = /^[a-zA-Z0-9_]{3,16}$/ ;
    return Regex.test(nameVal);
}
function isPassword(passwordVal){
    var Regex = /^[^\s]{6,20}$/ ;
    return Regex.test(passwordVal);
}

ajaxPost = function (urlAddress, postdata, funObj, ajaxDataType, asyncType, methodType, contType) {
    !asyncType && (asyncType = true);
    !ajaxDataType && (ajaxDataType = "json");
    !methodType && (methodType = "post");
    !postdata && (methodType = "GET");
    !contType && (contType = "application/x-www-form-urlencoded;charset=utf-8");

    $.ajax({
        type: methodType,
        url: urlAddress,
        async: asyncType,
        data: postdata,
        dataType: ajaxDataType,
        xhrFields: {withCredentials: true},
        crossDomain: true,
        contentType: contType,
        beforeSend: function () {
            funObj.ajaxBefore && funObj.ajaxBefore();
        },
        success: function (data) {
            funObj.ajaxSuccess(data, funObj);
        },
        complete: function () {
            funObj.ajaxComplete && funObj.ajaxComplete();
        },
        error: function (xhr, textStatus, errorThrown) {
            $('.xiaoyuanhuan').hide();
            if (xhr.status == 419) {
                Materialize.toast("你当前的会话已失效或无权访问该地址!", MSG_TIMEOUT);
                window.location.href = "login.html";
            } else {
                if (funObj.ajaxError) {
                    funObj.ajaxError();
                } else {
                    ajaxError();
                }
            }
            return;
        }
    });
};

ajaxError = function() {
    alert("操作失败！");
}

function transferMes(msg, resObj) {
    var tmpMsg = msg;
    if (msg) {
         var r = /\$\{((\w|\.)*)\}/g;
         var tmpRes,tmpVal;
         var group = msg.match(r);
         console.log(group);
         while( tmpRes = r.exec(msg)) {
           try {
             eval("tmpVal = resObj." + tmpRes[1]);
           } catch(e){}

           if(tmpVal != undefined) {
               if(tmpVal.replace) {
                 tmpVal = tmpVal.replace(" 00:00:00","");
               }
               tmpMsg = tmpMsg.replace(tmpRes[0],tmpVal);
            }else {
               tmpMsg = tmpMsg.replace(tmpRes[0],'');
            }
         }

         return tmpMsg;
    }
};

function ajaxUploadFile(urlAddress, formId, funObj,uploadProgress) {
    var oData = new FormData(document.forms.namedItem(formId));
    var oReq = new XMLHttpRequest();
    oReq.upload.addEventListener("progress", uploadProgress, false);
    oReq.open("POST", urlAddress, true);
    oReq.onload = function (oEvent) {
        if (oReq.status == 200) {
            data = JSON.parse(oReq.responseText);
            funObj.ajaxSuccess(data);
        } else {
            alert("上传失败!");
        }
    };
    oReq.send(oData);
};

UrlParm = function () { // url参数
    var data, index;
    (function init() {
        data = [];
        index = {};
        var u = window.location.search.substr(1);
        if (u != '') {
            var parms = decodeURIComponent(u).split('&');
            for (var i = 0, len = parms.length; i < len; i++) {
                if (parms[i] != '') {
                    var p = parms[i].split("=");
                    if (p.length == 1 || (p.length == 2 && p[1] == '')) {// p | p=
                        data.push(['']);
                        index[p[0]] = data.length - 1;
                    } else if (typeof(p[0]) == 'undefined' || p[0] == '') { // =c | =
                        data[0] = [p[1]];
                    } else if (typeof(index[p[0]]) == 'undefined') { // c=aaa
                        data.push([p[1]]);
                        index[p[0]] = data.length - 1;
                    } else {// c=aaa
                        data[index[p[0]]].push(p[1]);
                    }
                }
            }
        }
    })();
    return {
        // 获得参数,类似request.getParameter()
        parm: function (o) { // o: 参数名或者参数次序
            try {
                return (typeof(o) == 'number' ? data[o][0] : data[index[o]][0]);
            } catch (e) {
            }
        },
        //获得参数组, 类似request.getParameterValues()
        parmValues: function (o) { //  o: 参数名或者参数次序
            try {
                return (typeof(o) == 'number' ? data[o] : data[index[o]]);
            } catch (e) {
            }
        },
        //是否含有parmName参数
        hasParm: function (parmName) {
            return typeof(parmName) == 'string' ? typeof(index[parmName]) != 'undefined' : false;
        },
        // 获得参数Map ,类似request.getParameterMap()
        parmMap: function () {
            var map = {};
            try {
                for (var p in index) {
                    map[p] = data[index[p]];
                }
            } catch (e) {
            }
            return map;
        }
    }
}();

fullfillSingleObj = function(tempObj,destObj,dataObj) {
    var mes = tempObj.html();
    var recMsg;
    destObj.empty();
    recMsg = transferMes(mes,dataObj);
    destObj.append(recMsg);
};


fullfillListObj = function(tempObj,destObj,dataList) {
    var mes = tempObj.html();
    var recMsg;
    destObj.empty();
    $.each(dataList,function(index,rec){
        recMsg = transferMes(mes,rec);
        destObj.append(recMsg);
    });
};

Date.prototype.Format = function (fmt) { //author: meizz
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
};

function validateNull(formId) {
  var form = $("#" + formId);
  var ret = true;
  $.each(form.find("input"),function(i,inputObj){
    if($(inputObj).val().trim() == "") {
      $(inputObj).addClass(" ");
      ret = false;
      return ret;
    }
  });
  return ret;
}
