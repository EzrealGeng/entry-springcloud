package fun.gengyun.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义的组件必须是 @Configuration, 但是它不在主应用程序上下文的 @ComponentScan 中，否则会将所有 @RibbonClients 共享
 * 如果使用 @ComponentScan 或者 @SpringBootApplication 则需要采取措施避免包含(例如将其放在一个单独的，不重叠的包中)
 */
@Configuration
public class CustomRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
