package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@RequestMapping("/banner")
    public String getJson() {
        return "[{\"webUrl\":\"https://hao.360.cn/\",\"picUrl\":\"123456\"},"
                + "{\"webUrl\":\"https://hao.360.cn/\",\"picUrl\":\"123456\"}]";
    }

}
