package com.yilei.eurekafeignclient.controller;

import com.yilei.eurekafeignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yilei
 * @Date: 2020/1/5
 * @Description:
 */
@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping("hi")
    public String sayHi(@RequestParam(defaultValue = "leis", required = false) String name) {
        return hiService.sayHi(name);
    }

}
