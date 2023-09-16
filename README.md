
需求

* 生成压测样本，根据样本作为请求参数，进行压测。

环境

1. [压测的示例项目](https://github.com/meethigher/jmeter-example)：内置程序生成压测样本csv
2. [Jmeter环境](https://jmeter.apache.org/)

# **1.) 启动jmeter**

进入jmeter解压后的根目录，进入bin下，双击jmeter.cmd即可启动

# 2.) 创建ThreadGroup

在TestPlan下面，右键即可找到ThreadGroup

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916111237237.png)

配置1000并发，连续压测300秒。

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916111440939.png)

# 3.) 创建CSV Data Set Config

在ThreadGroup下面，右键添加CSV Data Set Config

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916111841756.png)

配置CSV Data Set Config，如图，根据你的CSV数据格式配置即可。

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916112209080.png)

# 4.) 创建HttpRequest

在ThreadGroup下面右键添加HttpRequest

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916112319919.png)

根据压测目标地址，进行HttpRequest的配置，如图

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916112546853.png)

# 5.) 汇总压测结果

根据实际需要，添加Listener即可。

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916113019052.png)

# 6.) 清空旧数据

每次压测前，都需要将旧数据进行清理。否则汇总结果，就会累加。

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916113325848.png)

# 7.) 开始压测

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916113434410.png)

# 8.) 分析数据观测瓶颈

只要服务器 或者 客户端，出现了处理器、内存、磁盘、网络，达到了80%以上，就说明该加机器了。

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916113952381.png)

![](https://meethigher.top/blog/2023/jmeter-example/image-20230916114042715.png)

