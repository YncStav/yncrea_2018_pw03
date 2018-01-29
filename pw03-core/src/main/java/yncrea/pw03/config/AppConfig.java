package yncrea.pw03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "yncrea.pw03.service")
public class AppConfig {
    @Bean
    public Properties dbProperties(){
        Properties dbProperties = new Properties();
        dbProperties.setProperty("driverClass", "com.mysql.jdbc.Driver");
        dbProperties.setProperty("jdbcUrl", "jdbc:mysql://localhost/yncrea_pw03");
        dbProperties.setProperty("username", "root");
        dbProperties.setProperty("password", "root");
        return dbProperties;
    }
}
