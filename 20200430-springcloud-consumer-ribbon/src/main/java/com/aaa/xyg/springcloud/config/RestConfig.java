package com.aaa.xyg.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
    /**
     *  @LoadBalanced默认轮询
     *
     *  实战常用的负载均衡算法:
     *          BestAvailabelRule:
     *              选择一个最小的并发服务
     * RetryRule:(是按照轮询规则来做的)
     *
     *
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 随机
     * @return
     */
    /*public IRule minRule(){
        return new RandomRule();

    }*/


}
