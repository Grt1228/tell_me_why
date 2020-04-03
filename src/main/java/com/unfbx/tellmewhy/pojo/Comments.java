package com.unfbx.tellmewhy.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 *
 * 回复实体类
 * @date 20190913
 * @author grt
 *
 */
@Data
public class Comments {

    /**
     * 主键
     */
    private Integer cid;
    /**
     * openid
     */
    @NotBlank(message = "用户标识不能为空")
    private String openid;
    /**
     * 评论昵称
     */
    @NotBlank(message = "用户昵称不能为空")
    private String nickName;
    /**
     * 评论头像
     */
    @NotBlank(message = "图像不能为空")
    private String avatarUrl;
    /**
     * 问题id
     */
    @NotBlank(message = "问题标识不能为空")
    private String qid;
    /**
     * 内容
     */
    @NotBlank(message = "评论内容不能为空")
    private String content;
    /**
     * 评论数
     */
    private Integer commentsNum;
    /**
     * 赞
     */
    private Integer likeNum;
    /**
     * 踩
     */
    private Integer unLikeNum;
    /**
     * 状态
     */
    private String status;
    /**
     * ip
     */
    private String ip;
    /**
     * 父id
     */
    private String parentid;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifieTime;

}
