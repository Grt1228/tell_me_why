package com.unfbx.tellmewhy.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 *
 * 问题实体类
 * @date 20190913
 * @author grt
 *
 */
@Data
public class Question {

    /**
     * 主题id
     */
    private Integer qid;
    /**
     * openid
     */
    @NotBlank(message = "用户id不为空")
    private String openid;
    /**
     * 标题
     */
    @NotBlank(message = "标题不为空")
    private String title;
    /**
     * 内容
     */
    @NotBlank(message = "内容不为空")
    private String content;
    /**
     * 简介
     */
    @NotBlank(message = "简介信息不为空")
    private String slug;
    /**
     * 类型
     */
    @NotBlank(message = "类别不为空")
    private String type;
    /**
     * 评论数
     */

    private Integer commentsNum;
    /**
     * 点击数
     */
    private Integer hits;
    /**
     * 赞
     */
    private Integer likeNum;
    /**
     * 踩
     */
    private Integer unLikeNum;
    /**
     * 头图
     */
    private String titlePic;
    /**
     * 状态
     */
    private String status;
    /**
     * 允许评论
     */
    private String allowComment;
    /**
     * 置顶
     */
    private String isTop;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifieTime;


    public Question(Integer qid,
                    @NotBlank(message = "用户id不为空") String openid,
                    @NotBlank(message = "标题不为空") String title,
                    @NotBlank(message = "内容不为空") String content,
                    @NotBlank(message = "简介信息不为空") String slug,
                    @NotBlank(message = "类别不为空") String type,
                    Integer commentsNum, Integer hits, Integer likeNum, Integer unLikeNum,
                    String titlePic,
                    String status,
                    String allowComment,
                    String isTop,
                    Date createTime,
                    Date modifieTime) {
        this.qid = qid;
        this.openid = openid;
        this.title = title;
        this.content = content;
        this.slug = slug;
        this.type = type;
        this.commentsNum = commentsNum;
        this.hits = hits;
        this.likeNum = likeNum;
        this.unLikeNum = unLikeNum;
        this.titlePic = titlePic;
        this.status = status;
        this.allowComment = allowComment;
        this.isTop = isTop;
        this.createTime = createTime;
        this.modifieTime = modifieTime;
    }

    public Question() {
    }
}
