package cn.xzf.provider.service.impl;


import cn.xzf.provider.dao.AirTicketDao;
import cn.xzf.provider.entity.AirTicket;
import cn.xzf.provider.service.AirTicketService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 飞机票表(AirTicket)表服务实现类
 *
 * @author makejava
 * @since 2023-02-03 11:01:17
 */
@Service
@Slf4j
public class AirTicketServiceImpl extends ServiceImpl<AirTicketDao, AirTicket> implements AirTicketService {

    @Override
    public void sellTicket(Long ticketId, int count) {
        log.info("卖票开始---------------------->");

        AirTicket airTicket = AirTicket.builder()
                .id(ticketId)
                .build();
        AirTicket airTicket1 = getById(ticketId);
        airTicket.setSurplusNum(airTicket1.getSurplusNum() - count);

        updateById(airTicket);

        // 这段代码就是模拟  发生异常
        System.out.println(1/0);
        log.info("<--------------------------卖票结束");
    }
}

