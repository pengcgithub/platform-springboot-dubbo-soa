# BUG

1、升级springBoot至2.1.0版本，spring-data-jpa方法报错（userDao.findById(id)），具体报错`Error:(34, 23) java: 无法将接口 org.springframework.data.repository.query.QueryByExampleExecutor<T>中的方法`

**解决方法：**[https://blog.csdn.net/chaoge321/article/details/83302380](https://blog.csdn.net/chaoge321/article/details/83302380)

2、springboot2.0.1 集成dubbo时启动包错找不到java.lang.NoClassDefFoundError: io/netty/channel/nio/NioEventLoopGrou

**解决方法：**[https://blog.csdn.net/qq_30264689/article/details/85068193](https://blog.csdn.net/qq_30264689/article/details/85068193)

3、Dubbo 2.6.5启动报java.lang.NoClassDefFoundError: org/apache/curator/RetryPolicy

**解决方法：**[https://blog.csdn.net/q283614346/article/details/85042152](https://blog.csdn.net/q283614346/article/details/85042152)

4、Fail to start qos server: , dubbo version: 2.6.5, current host: 192.168.31.46。java.net.BindException: Address already in use: bind

**解决方法：**[https://blog.csdn.net/u012988901/article/details/84503672](https://blog.csdn.net/u012988901/article/details/84503672)

5、com.mongodb.MongoSocketOpenException: Exception opening socket，分析估计是由于引入Hmily分布式分布式框架导致的。

**解决方法：**[https://blog.csdn.net/qq_30558809/article/details/79985059](https://blog.csdn.net/qq_30558809/article/details/79985059)

6、升级dubbo 2.7.1整合nacos报错，Nacos with dubbo can't change dubbo dependency to apache dubbo.

**解决方法：**[https://github.com/apache/incubator-dubbo/issues/3797](https://github.com/apache/incubator-dubbo/issues/3797)

## 参考资料

- [https://gitee.com/cb_1234/cemb-ssm](https://gitee.com/cb_1234/cemb-ssm)