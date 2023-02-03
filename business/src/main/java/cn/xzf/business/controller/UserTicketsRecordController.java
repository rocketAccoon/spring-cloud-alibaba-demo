package cn.xzf.business.controller;

import cn.xzf.business.service.UserTicketsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userTickets")
public class UserTicketsRecordController {

    @Resource
    private UserTicketsService userTicketsService;

    @GetMapping("/add")
    public void addRecords() {
        userTicketsService.addRecord();
    }
}
