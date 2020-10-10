package fun.gengyun.springcloud.service;

import fun.gengyun.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(int id);

    List<Dept> queryAll();
}
