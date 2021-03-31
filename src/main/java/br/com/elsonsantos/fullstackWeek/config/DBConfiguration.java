package br.com.elsonsantos.fullstackWeek.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Getter
@Setter
@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testeDatabaseConnection(){
        System.out.println("BD connection for DEV-H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DBconnection to H2_TEST- Test instance";
    }
    @Profile("prod")
    @Bean
    public String productionDataBaseConnection(){
        System.out.println("DB connection for Production - MySQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DBconnection to MySQL_PROD- Production instance";
    }
}
