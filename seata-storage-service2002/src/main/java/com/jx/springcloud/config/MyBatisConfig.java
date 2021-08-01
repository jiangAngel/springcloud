package com.jx.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.jx.springcloud.dao")
public class MyBatisConfig {
}
