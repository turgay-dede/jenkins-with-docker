package com.turgaydede;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("org.hibernate.dialect.PostgreSQLDialect")
                .url("jdbc:postgresql://192.168.56.114:5432/test")
                .username("turgay")
                .password("123456")
                .build();
    }
}
