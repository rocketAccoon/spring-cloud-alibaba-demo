package cn.xzf.customer.controller;

import cn.xzf.customer.service.openfeign.ProviderDemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class CustomerDemoController {
    @Autowired
    private ProviderDemoFeign providerDemoFeign;


    @GetMapping("/test")
    public String test() {
        return "我是Customer";
    }

    @GetMapping("/p")
    public String testProvider() {
        return providerDemoFeign.test();
    }
}
