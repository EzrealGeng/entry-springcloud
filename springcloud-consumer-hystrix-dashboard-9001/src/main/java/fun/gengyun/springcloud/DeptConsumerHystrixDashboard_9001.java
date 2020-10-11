package fun.gengyun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard // 开启hystrix监控页面
public class DeptConsumerHystrixDashboard_9001 {

    // http://localhost:9001/hystrix

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashboard_9001.class, args);
    }
}
