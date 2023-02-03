package cn.xzf.provider.controller;


import cn.xzf.provider.service.AirTicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 飞机票表(AirTicket)表控制层
 *
 * @author makejava
 * @since 2023-02-03 10:30:47
 */
@RestController
@RequestMapping("airTicket")
public class AirTicketController {
    /**
     * 服务对象
     */
    @Resource
    private AirTicketService airTicketService;

    @GetMapping("/sell")
    public void sellTicket() {
        airTicketService.sellTicket(1L, 2);
    }
}

