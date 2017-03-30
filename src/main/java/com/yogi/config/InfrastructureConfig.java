package com.yogi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


/**
 * Created by danchara on 3/30/2017.
 */

@Configuration
public class InfrastructureConfig {

    @Bean
    DataSource DataSource(){
//        System.out.println("InfrastructureConfig.DataSource");
        return new DriverManagerDataSource();
    }

    @Bean
    DataSource dataSource(){


//        System.out.println("InfrastructureConfig.dataSource");;
        return new DriverManagerDataSource();

    }
}
