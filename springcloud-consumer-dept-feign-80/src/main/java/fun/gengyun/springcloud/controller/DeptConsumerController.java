package fun.gengyun.springcloud.controller;

import fun.gengyun.springcloud.pojo.Dept;
import fun.gengyun.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService = null;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") int id) {
        return deptClientService.queryById(id);
    }

    @PostMapping("/consumer/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptClientService.addDept(dept);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.queryAll();
    }
}
