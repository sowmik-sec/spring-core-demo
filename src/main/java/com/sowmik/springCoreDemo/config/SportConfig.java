package com.sowmik.springCoreDemo.config;

import com.sowmik.springCoreDemo.common.Coach;
import com.sowmik.springCoreDemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
