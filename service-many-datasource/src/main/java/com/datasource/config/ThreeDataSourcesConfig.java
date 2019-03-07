package com.datasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @Author:zxh
 * @Description:
 * @Date: 2019/3/7
 * @Modified By:
 */
@Configuration
@MapperScan(basePackages = ThreeDataSourcesConfig.PACKAGES,sqlSessionFactoryRef = "threeSqlSessionFactory")
public class ThreeDataSourcesConfig {
    static final String PACKAGES = "com.datasource.mapper.three";

    private static final String MAPPER_LOCAL = "classpath:mapper/three/*.xml";

    @ConfigurationProperties("custom.datasource.ds2")
    @Bean(name = "threeDataSource")
    public DruidDataSource druidDataSource(){
        return new DruidDataSource();
    }

    @Bean(name = "threeTransactionManager")
    public DataSourceTransactionManager threeTransactionManager(){
        return new DataSourceTransactionManager(druidDataSource());
    }

    @Bean(name = "threeSqlSessionFactory")
    public SqlSessionFactory threeSqlSessionFactory(@Qualifier("threeDataSource")DruidDataSource dataSource)throws Exception{
        final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCAL));
        return sessionFactoryBean.getObject();
    }

}
