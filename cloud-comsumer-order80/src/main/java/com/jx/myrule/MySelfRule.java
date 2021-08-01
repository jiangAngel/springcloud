package com.jx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    /**
     * 随机访问
     * @return
     */
    @Bean
    public IRule rule() {
        return new RandomRule();
    }
}
