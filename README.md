# consumer
* consumer主要消费服务，因此就会主动调用其他服务，在spring-cloud中，我们使用feign作为web service
客户端
* 调用时，需要注明提供者的spring.application.name，参数必须保持一致
* 可以修改端口启动两个provider，修改他们的返回值，这样就可以直观的看到Eureka的负载均衡了
* 在实践中，书写了两种熔断的实例。