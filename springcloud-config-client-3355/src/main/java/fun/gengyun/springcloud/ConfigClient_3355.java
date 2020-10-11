package fun.gengyun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClient_3355 {

    // 并不是访问localhost:3355/config
    // 而是访问localhost:8201/config 端口是从git读取的
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient_3355.class, args);
    }
}
