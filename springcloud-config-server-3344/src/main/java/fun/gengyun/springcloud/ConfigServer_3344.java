package fun.gengyun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer_3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_3344.class, args);
    }
    /*
     /{application}/{profile}[/{label}]
     /{application}-{profile}.yml
     /{label}/{application}-{profile}.yml
     /{application}-{profile}.properties
     /{label}/{application}-{profile}.properties

     label === 分支

     http://localhost:3344/application-dev.yml
     http://localhost:3344/application/dev/master
     */
}
