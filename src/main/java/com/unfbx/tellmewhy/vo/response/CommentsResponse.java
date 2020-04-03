package com.unfbx.tellmewhy.vo.response;

import com.unfbx.tellmewhy.pojo.Question;

import java.util.Date;

public class CommentsResponse {
    /**
     * 主键
     */
    private Integer cid;
    /**
     * openid
     */
    private String openid;
    /**
     * 评论昵称
     */
    private String nickName;
    /**
     * 评论头像
     */
    private String avatarUrl;
    /**
     * 问题id
     */
    private String qid;
    /**
     * 内容
     */
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
    /**
     * 一对一
     * 一个回答对应一个问题
     */
    private Question question;
}
