package fun.gengyun.spirngcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // 相当于 applicationContext.xml
public class ConfigBean {

    /*
    IRule 负载均衡策略
    AvailabilityFilteringRule: 会先过滤，跳闸，访问故障的服务 对剩下的进行轮询
    RoundRobinRule: 轮询策略
    RandomRule: 随机策略
    RetryRule: 先按照轮询策略获取服务 如果服务获取失败 则会在指定的时间内重试
     */

    @Bean
    @LoadBalanced // Ribbon 配置负载均衡restTemplate 默认轮询
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
