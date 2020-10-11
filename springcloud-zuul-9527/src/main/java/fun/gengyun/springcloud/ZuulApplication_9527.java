package fun.gengyun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启zuul代理
public class ZuulApplication_9527 {

    // 1. www.gengyun.com:9527/springcloud-provider-dept/dept/get/1

    /*
    1. www.gengyun.com:9527/springcloud-provider-dept/dept/get/1
    2. localhost:8001/dept/get/1
    1和2相等 隐藏真实服务地址
     */

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_9527.class, args);
    }
}
