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
     # com.netflix.loadbalancer.RoundRobinRule  - 轮询
     # com.netflix.loadbalancer.RandomRule  - 随机
     # com.netflix.loadbalancer.RetryRule - 重试，先按RoundRobinRule进行轮询，如果失败就在指定时间内进行重试
     # com.netflix.loadbalancer.WeightedResponseTimeRule - 权重，响应速度越快，权重越大，越容易被选中。
     # com.netflix.loadbalancer.BestAvailableRule  - 先过滤掉不可用的处于断路器跳闸转态的服务，然后选择一个并发量最小的服务
     # com.netflix.loadbalancer.AvailabilityFilteringRule - 先过滤掉故障实例，再选择并发量较小的实例
     # com.netflix.loadbalancer.ZoneAvoidanceRule - 默认规则，复合判断server所在区域的性能和server的可用性进行服务的选择。
     */

    /*
     自定义负载均衡策略
     第一步：新建一个不会被@ComponentScan组件扫描到的包，如：fun.gengyun.myRule
     第二步：在该包下新建自己的负载均衡算法的规则类
     第三步：主启动类上添加注解：@RibbonClient
     */

    @Bean
    @LoadBalanced // Ribbon 配置负载均衡restTemplate 默认轮询
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
