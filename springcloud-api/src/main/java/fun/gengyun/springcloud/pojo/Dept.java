package fun.gengyun.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {

    private int deptno;

    private String dname;
    // 数据是存在哪个数据库的
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
