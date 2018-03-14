# hessian study

本Demo 的启动主要包含两个步骤

1. 在tomcat 中运行servlet 的程序
2. 运行Client 的main 方法
3. 查看运行结果

> hessian 的客户端，主要是通过Java的动态代理，创建接口的代理类，同时封装了HTTP的协议和Hessian 的序列化操作。

> hessian 的服务端，通过InputStream，反序列化请求的请求的方法和参数，invoke 相应的method，然后通过outputStream 

> hessian 的弊端，hessian 需要提前约定服务端的地址，相当于客户端需要知道服务端的部署情况，耦合性较大，这个可能也是dubbo 对hessian 改进的地方。

> 以上是对Demo的一些简单思考，如果后续有改动，继续更新。。。