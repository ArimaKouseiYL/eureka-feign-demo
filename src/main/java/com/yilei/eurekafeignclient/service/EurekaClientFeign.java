package com.yilei.eurekafeignclient.service;

import com.yilei.eurekafeignclient.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: yilei
 * @Date: 2020/1/5
 * @Description:FeignClient
 */

@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {
    /**
     * @FeignClient : 声明一个Feign Client
     * value : 为远程调用其他服务的服务名
     * FeignConfig.class : 为Feign Client的配置类
     */

    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);

}
