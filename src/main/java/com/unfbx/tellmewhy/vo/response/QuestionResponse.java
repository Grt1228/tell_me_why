package com.unfbx.tellmewhy.vo.response;

import com.unfbx.tellmewhy.pojo.Comments;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 【问题】出参
 * @create GRT
 * @date 20190813
 *
 */
@Data
public class QuestionResponse {

    /**
     * 主题id
     */
    private Integer qid;
    /**
     * openid
     */
    private String openid;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 类型
     */
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

    List<Comments> comments = new ArrayList<>();
}
