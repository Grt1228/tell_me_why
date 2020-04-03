package com.unfbx.tellmewhy.vo.request;

import com.unfbx.tellmewhy.constant.PageRequest;
import lombok.Data;

@Data
public class CommentsRequest extends PageRequest {
    /**
     * openid
     */
    private String openid;
    /**
     * 问题id
     */
    private Integer qid;

    /**
     * 父级评论id
     */
    private String parentid;
    /**
     * 评论状态
     */
    private String status;
}
