package cn.xzf.business.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * (UserTickets)表实体类
 *
 * @author makejava
 * @since 2023-02-03 15:37:02
 */
@SuppressWarnings("serial")
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@TableName("user_tickets")
public class UserTickets implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    //用户id
    private Long userId;
    //机票id
    private Long ticketId;
    //机票数量
    private Integer totalNum;
}

