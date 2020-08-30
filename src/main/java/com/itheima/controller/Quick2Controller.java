package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//  通过value注解 ，精确获得yml文件中的信息
public class Quick2Controller {
	
		@Value("${name}")
		private String name;
		@Value("${person.addr}")
		private String addr;
		@RequestMapping("/quick2")
		@ResponseBody
		public String quick2(){
			
			return "  name:  "+name+"  addr:  "+addr;
		}
}
