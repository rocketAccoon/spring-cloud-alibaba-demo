package cn.xzf.customer.service.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "provider", path = "/provider/demo")
public interface ProviderDemoFeign {
    @GetMapping("/test")
    String test();
}
