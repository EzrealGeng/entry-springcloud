# springcloud入门

## 参考文档
- [https://springcloud.cc/spring-cloud-netflix.html](https://springcloud.cc/spring-cloud-netflix.html)
- 中文api文档: [https://springcloud.cc/spring-cloud-dalston.html](https://springcloud.cc/spring-cloud-dalston.html)
- SpringCloud中国社区：[http://springcloud.cn/](http://springcloud.cn/)
- SpringCloud中文网：[https://springcloud.cc](https://springcloud.cc)

## 大版本说明

|  Spring Boot   | Spring Cloud  | 关系  |
|  ----  | ----  | ----  |
| 1.2.X  | Angel版本(天使) | 兼容Spring Boot 1.2.X  |
| 1.3.X  | Brixton版本(布里克斯顿) | 兼容Spring Boot 1.3.X，也兼容Spring Boot 1.4.X  |
| 1.4.X  | Camden版本(卡姆登) | 兼容Spring Boot 1.4.X，也兼容Spring Boot 1.5.X   |
| 1.5.X  | Dalston版本(多尔斯顿) | 兼容Spring Boot 1.5.X，不兼容Spring Boot 2.0.X   |
| 1.5.X  | Edgware版本(埃奇韦尔) | 兼容Spring Boot 1.5.X，不兼容Spring Boot 2.0.X   |
| 2.0.X  | Finchley版本(芬奇利) | 兼容Spring Boot 2.0.X，不兼容Spring Boot 1.5.X   |
| 2.1.X  | Greenwich版本(格林威治) | ----  |

## 实际开发版本关系

|  spring-boot-starter-parent   |  | spring-cloud-dependencies  |  |
|  ----  | ----  | ----  | ----  |
| 版本号  | 发布日期 | 版本号 | 发布日期 |
| 1.5.2.RELEASE  | 2017年3月 | Dalston.RC1 | 2017年 |
| 1.5.9.RELEASE  | 2017年11与 | Edgware.RELEASE | 2017年11月 |
| 1.5.16.RELEASE  | 2018年9月 | Edgware.SR5 | 2018年10月 |
| 1.5.20.RELEASE  | 2019年4月 | Edgware.RC1 | 2018年10月 |
| 2.0.2.RELEASE  | 2018年5月 | Finchley.BUILD-SNAPSHOT | 2018年 |
| 2.0.6.RELEASE  | 2018年10月 | Finchley.SR2 | 2018年10月 |
| 2.1.4.RELEASE  | 2019年4月 | Greenwich.SR1 | 2019年5月 |

## Ribbon和GFeign
调用微服务的两种方式
1.微服务名字[Ribbon]
2.接口和注解[Feign]

##服务熔断和降级
服务熔断是在服务端处理 某个服务超时或者异常就会引起熔断
服务降级是在客户端处理 从整体网站请求负载考虑[当某个服务熔断或关闭之后，服务将不再被调用]，此时可以在客户端准备一个FallbackFactory返回一个默认的缺省值