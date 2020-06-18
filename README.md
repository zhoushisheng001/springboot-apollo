对Apollo配置中心的支持
主要分为下面的步骤
1. 引入依赖
 
<!-- 集成apollo 配置start -->

   <!-- https://mvnrepository.com/artifact/com.ctrip.framework.apollo/apollo-core -->
    <dependency>
       <groupId>com.ctrip.framework.apollo</groupId>
       <artifactId>apollo-core</artifactId>
       <version>1.5.0</version>
    </dependency>
    
  <!-- https://mvnrepository.com/artifact/com.ctrip.framework.apollo/apollo-client -->
    <dependency>
       <groupId>com.ctrip.framework.apollo</groupId>
       <artifactId>apollo-client</artifactId>
       <version>1.5.0</version>
    </dependency>

<!-- 集成apollo 配置start -->

2. 在启动类上面加上开启注解
@EnableApolloConfig

3. 在resources/META-INF/app.properties 文件
   apollo项目的唯一标识 app.id=SampleApp

4. 在 resources 下面添加 apollo-env.properties 文件内容如下
   
   local.meta=http://192.168.198.130:8080
   dev.meta=http://192.168.198.130:8080
   fat.meta=${fat_meta}
   uat.meta=${uat_meta}
   lpt.meta=${lpt_meta}
   pro.meta=${pro_meta}
   
5. 在 C:\opt\settings 目录下面添加配置文件 server.properties
   env=DEV  表示激活的环境

6. 登录的apollo的用户 名称为 apollo 密码为 admin 端口为 8070
   http://192.168.198.130:8070
   
   
