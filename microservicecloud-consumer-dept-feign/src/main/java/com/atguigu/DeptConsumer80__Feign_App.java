package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=RandomRule_ZY.class)
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
@ComponentScan("com.atguigu.springcloud")
public class DeptConsumer80__Feign_App
{
  public static void main(String[] args)
  {
   SpringApplication.run(DeptConsumer80__Feign_App.class, args);
  }
}

