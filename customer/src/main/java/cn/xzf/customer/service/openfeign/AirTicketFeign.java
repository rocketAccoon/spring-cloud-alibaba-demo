package cn.xzf.customer.service.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(contextId = "ticket", value = "provider", path = "/provider/airTicket")
public interface AirTicketFeign {
    @GetMapping("/sell")
    String sellTicket();
}
