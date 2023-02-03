package cn.xzf.business.service;

import cn.xzf.business.entity.UserTickets;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * (UserTickets)表服务接口
 *
 * @author makejava
 * @since 2023-02-03 15:37:02
 */
public interface UserTicketsService extends IService<UserTickets> {
    void addRecord();
}

