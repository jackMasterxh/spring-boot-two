package com.datasource.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @Author:zxh
 * @Description:
 * @Date: 2019/3/7
 * @Modified By:
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/druid/*",initParams = {
        @WebInitParam(name = "deny",value = "126.12.22.1"),//黑名单 (存在共同时，deny优先于allow)
        @WebInitParam(name="loginUsername",value="zhangxiaohu"),// 用户名
        @WebInitParam(name="loginPassword",value="123"),// 密码
        @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
})
public class DruidStateViewServlet extends StatViewServlet{
}
