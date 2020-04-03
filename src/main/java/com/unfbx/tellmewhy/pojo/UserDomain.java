package com.unfbx.tellmewhy.pojo;

import lombok.Data;

import java.util.Date;

/**
 *
 * 用户实体类
 * @date 20190913
 * @author grt
 *
 */
@Data
public class UserDomain {
    /**
     * id主键
     */
    private Integer id;
    /**
     * openid
     */
    private String openid;
    /**
     * 客户端
     * 微信
     * QQ
     */
    private String client;
    /**
     * 性别
     */
    private String gender;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 头像地址
     */
    private String avatarUrl;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 状态
     */
    private String status;
    /**
     * 权限
     */
    private String role;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifieTime;

}
