package cn.xzf.customer.service.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(contextId = "userTickets", value = "business", path = "/business/userTickets")
public interface UserTicketsFeign {
    @GetMapping("/add")
    String addRecords();
}
