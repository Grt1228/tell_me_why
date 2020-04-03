package com.unfbx.tellmewhy.service.comments;

import com.unfbx.tellmewhy.pojo.Comments;
import com.unfbx.tellmewhy.vo.request.CommentsRequest;
import com.unfbx.tellmewhy.vo.response.CommentsResponse;

import java.util.List;

/**
 * 评论相关
 *
 */
public interface CommentsService {
    /**
     * 更新评论
     * 状态
     * @param request
     * @return
     */
    Comments update(Comments request);

    /**
     * 查询用户的评论列表
     * @param request
     * @return
     */
    List<CommentsResponse> findByOpenid(CommentsRequest request);

    /**
     * 新增一条评论
     * @param comments
     * @return
     */
    Comments insert(Comments comments);
}
