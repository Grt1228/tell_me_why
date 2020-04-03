package com.unfbx.tellmewhy.constant;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 描述:
 * 抽象类分页相关
 *
 * @author grt
 * @create 2018-04-28 16:00
 */
@Data
public abstract class PageRequest implements Serializable {

    @NotBlank(message = "页数不为空")
    private Integer pageNum;

    private Integer pageSize = 6;

    private String orderBy;

    private String status = ConstValue.Status.YES.getCode();


}