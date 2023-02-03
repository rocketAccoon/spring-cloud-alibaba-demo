package cn.xzf.customer.service.Impl;

import cn.xzf.customer.service.TicketService;
import cn.xzf.customer.service.openfeign.AirTicketFeign;
import cn.xzf.customer.service.openfeign.UserTicketsFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TicketServiceImpl implements TicketService {
    @Resource
    private AirTicketFeign airTicketFeign;

    @Resource
    private UserTicketsFeign userTicketsFeign;

    @Override
    @GlobalTransactional
    public void buyTicket() {
        //添加购票记录
        userTicketsFeign.addRecords();
        //售票
        airTicketFeign.sellTicket();
    }
}
