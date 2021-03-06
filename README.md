# platform-spring-boot-dubbo-soa

搭建一整套微服务体系的架构，主要以阿里系产品为中心的dubbo微服务架构。

## 基础环境

- spring-boot 2.1.1.RELEASE
- dubbo 2.7.1
- dubbo-spring-boot-starter 2.7.1
- spring-data-jpa
- mybatis
- [mapper](https://github.com/abel533/Mapper)
- [Mybatis-PageHelper](https://github.com/pagehelper/Mybatis-PageHelper)
- swagger 2.2.2


## 微服务体系

### *已整合*

- spring-boot + dubbo基础环境

- 服务注册中心
	- [Nacos](https://github.com/alibaba/Nacos)
	
- 服务管理
    - [dubbo-admin](https://github.com/apache/dubbo-admin)
    
- 服务熔断
    - [Hystrix](https://github.com/Netflix/Hystrix)

### *计划整合*

- 分布式ID
    - twitter-archive/snowflake

- 分布式事务
	- [hmily](https://github.com/yu199195/hmily)
	- [seata](https://github.com/seata/seata)

- 服务监控

- 服务网关
	- [soul](https://github.com/Dromara/soul)

- 服务熔断
	- [Sentinel](https://github.com/alibaba/Sentinel)

- 服务配置中心
	- [apollo](https://github.com/ctripcorp/apollo)
	- [nacos](https://github.com/alibaba/Nacos)

- 链路跟踪
	- [zipkin](https://github.com/openzipkin/zipkin)

- 定时任务
	- [xxl-job](https://github.com/xuxueli/xxl-job)

- 日志系统
	- ELK

- 分库分表
	- [sharding-sphere](https://github.com/sharding-sphere/sharding-sphere)

- Docker容器化

## 文档目录

- [BUG.LOG.md](./doc/BUG.LOG.md)
- [dubbo-ops.md](./doc/dubbo-ops.md)

## 联系(Contact)

- [pengcheng3211@163.com](https://github.com/pengcgithub)

