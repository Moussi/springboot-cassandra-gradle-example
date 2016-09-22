package com.ioteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Moussi Aymen
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class OctopusGlobalConfig {

    public static void main(String[] args) {
        SpringApplication.run(OctopusGlobalConfig.class, args);
    }


}
