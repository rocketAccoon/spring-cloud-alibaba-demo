package cn.xzf.provider.service;

import cn.xzf.provider.entity.AirTicket;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 飞机票表(AirTicket)表服务接口
 *
 * @author makejava
 * @since 2023-02-03 10:30:47
 */
public interface AirTicketService extends IService<AirTicket> {
    /**
     * 售票
     * @param ticketId 机票id
     * @param count 数量
     */
    void sellTicket(Long ticketId, int count);
}

