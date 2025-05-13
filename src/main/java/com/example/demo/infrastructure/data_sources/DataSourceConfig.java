package com.example.demo.infrastructure.data_sources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
     @Bean
     public DataSource dataSource() {
          // Usamos H2 en memoria
          DriverManagerDataSource dataSource = new DriverManagerDataSource();
          dataSource.setDriverClassName("org.h2.Driver");
          dataSource.setUrl("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1"); // Keep DB alive until app stops
          dataSource.setUsername("sa");
          dataSource.setPassword("");
          return dataSource;
     }
}
