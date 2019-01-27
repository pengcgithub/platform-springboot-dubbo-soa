# dubbo-ops

dubbo项目进入Apache之后原来dubbo-admin的进化版本，现今用springboot+vue重写了原先的管理系统。
[https://github.com/apache/incubator-dubbo-ops](https://github.com/apache/incubator-dubbo-ops)

## 部署

#### dubbo-admin-backend

- 修改`application.properties`文件，用户监控注册中心地址。
<pre>
admin.registry.address=zookeeper://127.0.0.1:2181
admin.config-center=zookeeper://127.0.0.1:2181
admin.metadata.address=zookeeper://127.0.0.1:2181
</pre>

- maven打包部署:`mvn clean package`

- 部署:`java -jar dubbo-admin-backend-0.0.1-SNAPSHOT.jar`

- 通过swagger访问:`http://localhost:8080/swagger-ui.html`

#### dubbo-admin-frontend

- 进入`dubbo-admin-frontend`目录：`cd ./dubbo-admin-frontend`
- 安装项目运行所的包：`cnpm install`
- 运行：`npm run dev`
- 访问：`http://localhost:4000`