package com.example.xsq.util;
/**
 * 与服务器链接使用地址 公共类。
 * @author Administrator
 *
 */
public class ConnectionAddress {
    // 基础IP 地址
    public static final String BASE_Adress="http://192.168.1.191/";

    // 基础二级分类地址
    public static final String BASE_SecondAdress = "/app/hm";

    // 登录使用接口地址
    public static final String BASE_GET_TOKEN = BASE_Adress+"/app/hm/lg/reg/dlg";

    // 获取注册验证码
    public static final String Base_Get_PhoneCode= BASE_Adress+BASE_SecondAdress+"/lg/reg/src";

    //验证短信验证码是否正确
    public static final String Base_IsTrue_PhoneCode= BASE_Adress+BASE_SecondAdress+"/lg/reg/scc";
    // 用户申请注册
    public static final String Base_reg= BASE_Adress+BASE_SecondAdress+"/lg/reg/dreg";

    //个人中心
    public static final String Base_MeMain= BASE_Adress+"/app/mg/inx/ucc/inf";
}
