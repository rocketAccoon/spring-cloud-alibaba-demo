package cn.xzf.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class ProviderDemoController {
    @GetMapping("/test")
    public String test() {
        return "我是provider";
    }
}
