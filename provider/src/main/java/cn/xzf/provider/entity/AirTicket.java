package cn.xzf.provider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 飞机票表(AirTicket)表实体类
 *
 * @author makejava
 * @since 2023-02-03 10:30:47
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@TableName("air_ticket")
public class AirTicket implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    //起飞城市
    private String fromCity;
    //目的地城市
    private String toCity;
    //库存数量
    private Integer surplusNum;
    //出发时间
    private Date startTime;
    //创建人id
    private Long createdBy;
    //创建时间
    private Date createTime;
    //修改人
    private Long updatedBy;
    //修改时间
    private Date updateTime;
}

