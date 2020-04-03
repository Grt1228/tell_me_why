package com.unfbx.tellmewhy.service.user;

import com.unfbx.tellmewhy.pojo.Question;
import com.unfbx.tellmewhy.pojo.UserDomain;
import com.unfbx.tellmewhy.utils.APIResponse;
import com.unfbx.tellmewhy.vo.request.CommentsRequest;
import com.unfbx.tellmewhy.vo.response.CommentsResponse;

import java.util.List;

/**
 * 用户相关接口
 */
public interface UserService {
    /**
     * 查询用户
     * @param uid
     * @return
     */
    UserDomain getUserInfoById(Integer uid);

    /**
     * openid查询
     * @param request
     * @return
     */
    APIResponse<List<Question>> findQuestionByOpenid(CommentsRequest request);

    APIResponse<List<CommentsResponse>> findCommentsByOpenid(CommentsRequest request);
}
