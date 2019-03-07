package com.datasource.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Author:zxh
 * @Description: alibaba druid的过滤
 * @Date: 2019/3/7
 * @Modified By:
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",
initParams = {@WebInitParam(name = "exclusions",value = "*.mp4,*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")})
public class DruidStatFilter extends WebStatFilter{
}
