## 优惠券项目

1.优惠券模板服务
2.优惠券计算服务
3.优惠券消费服务
4.优惠券中间件服务

在每一个以“-serv”结尾的业务子模块中，我们从内部分层的角度对其做了进一步拆分。
以这里要搭建的 coupon-template-serv 为例，它内部包含了三个子模块：
coupon-template-api：存放公共 POJO 类或者对外接口的子模块；
coupon-template-dao：存放数据库实体类和 Dao 层的子模块；
coupon-template-impl：核心业务逻辑的实现层，对外提供 REST API。
