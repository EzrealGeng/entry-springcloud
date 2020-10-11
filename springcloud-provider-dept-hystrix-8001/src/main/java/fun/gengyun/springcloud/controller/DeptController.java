package fun.gengyun.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import fun.gengyun.springcloud.pojo.Dept;
import fun.gengyun.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//提供restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    // 获取一些配置的信息，得到具体的微服务
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") int id) {
        Dept dept = deptService.queryById(id);
        if(dept == null) {
            throw new RuntimeException("id=>" + id + ",不存在，或者信息无法找到");
        }
        return dept;
    }

    // 备选方法
    public Dept hystrixGet(@PathVariable("id") int id) {
        return new Dept().setDeptno(id).setDname("id=>" + id + ",没有对应信息, null--@Hystrix").setDb_source("no this database in MySQL");
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    public Object discovery() {
        // 获取微服务列表清单
        List<String> services = client.getServices();
        System.out.println("discovery=>services" + services);
        // 得到一个具体的微服务信息，通过具体的微服务id applicationName
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT-8001");

        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "\t"
                                + instance.getPort() + "\t"
                                + instance.getUri() + "\t"
                                + instance.getServiceId());
        }
        return this.client;
    }
}
