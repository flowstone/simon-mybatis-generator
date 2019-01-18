# simon-mybatis-generator
Mybatis生成器
#### 文件说明
* Generator.java - 生成器主入口
* mybatis-generator.xml - 生成器配置文件
* generator.properties - 数据库配置文件

#### 使用说明
1. 修改generator.properties数据库配置文件
2. 修改mybatis-generator.xml生成器配置文件
```xml
<!-- 要生成的表 tableName是数据库中的表名或视图名 domainObjectName是实体类名，需要根据自己的需求修改-->
<table  tableName="candidate" domainObjectName="Candidate" enableCountByExample="false"
    enableDeleteByExample="false" enableSelectByExample="false" enableUpdateByExample="false">
    <generatedKey column="id" sqlStatement="MySql" identity="true" />
</table>
```
3. 执行Generator.java中的主函数，生成对应的方法

