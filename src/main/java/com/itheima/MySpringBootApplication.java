package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//   声明该类是一个springboot的引导类，谁身上有这个注解，谁就是引导类
@SpringBootApplication
public class MySpringBootApplication {

//	main 是java程序的入口
	public static void main(String[] args){
//	run方法表示运行springboot的引导类，run参数是引导类的字节码对象
		SpringApplication.run(MySpringBootApplication.class);
		
	}
}
