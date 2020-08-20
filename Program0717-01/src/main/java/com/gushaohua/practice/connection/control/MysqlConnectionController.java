package com.gushaohua.practice.connection.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nihao")
public class MysqlConnectionController {

	@ResponseBody
	@RequestMapping("/connection")
	public String connection() {
		System.out.println("test git commit");
		return "wo diao ni ma de";
		
	}
}
