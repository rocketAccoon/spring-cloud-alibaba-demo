package cn.xzf.business.service.impl;


import cn.xzf.business.dao.UserTicketsDao;
import cn.xzf.business.entity.UserTickets;
import cn.xzf.business.service.UserTicketsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (UserTickets)表服务实现类
 *
 * @author makejava
 * @since 2023-02-03 15:37:02
 */
@Service
@Slf4j
public class UserTicketsServiceImpl extends ServiceImpl<UserTicketsDao, UserTickets> implements UserTicketsService {
    @Resource
    private UserTicketsDao userTicketsDao;

    @Override
    public void addRecord() {
        log.info("开始添加购票记录-----------------------<");
        UserTickets userTickets = UserTickets.builder()
                .id(1L)
                .ticketId(1L)
                .userId(1L)
                .totalNum(2)
                .build();
        save(userTickets);
        log.info("-----------------------<添加购票记录结束");
    }
}

