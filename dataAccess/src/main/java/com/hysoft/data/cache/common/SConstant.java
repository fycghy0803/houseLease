package com.hysoft.data.cache.common;

public interface SConstant {
	String APPLICATION_JSON = "application/json;charset=UTF-8";
	String TEXT_HTML = "text/html;charset=UTF-8";

	enum CLIENT {
		common
	}

	/**
	 * 短信平台发送格式
	 */
	enum MESSAGE_SEND_TYPE {
		xml, // xml格式发送
		json// json格式发送
	}

	/**
	 * 短信发送的类型
	 */
	enum MESSAGE_TYPE {
		phoneValidate // 一般验证码短信
	}

	String USER_ID = "userId";
	String USER_PWD = "userPassword";
	String LOGIN_NAME = "loginName";
	String LOGIN_TEL = "loginTel";
    String ERR_PWD_NUM ="errPwdNum";
    String USER_TEL ="userTel";
    String USER_MAIL="userMail";
    String CHARGE_NAME_NUM="chargeNameNum";
    String LAST_LOGIN_TIME ="lastLoginTime";
}
