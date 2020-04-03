package com.unfbx.tellmewhy.service.user.impl;

import com.unfbx.tellmewhy.dao.QuestionDao;
import com.unfbx.tellmewhy.pojo.Question;
import com.unfbx.tellmewhy.pojo.UserDomain;
import com.unfbx.tellmewhy.service.user.UserService;
import com.unfbx.tellmewhy.utils.APIResponse;
import com.unfbx.tellmewhy.vo.request.CommentsRequest;
import com.unfbx.tellmewhy.vo.response.CommentsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户相关操作
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private QuestionDao questionDao;

    /**
     * 查询用户
     *
     * @param uid
     * @return
     */
    @Override
    public UserDomain getUserInfoById(Integer uid) {
        return null;
    }

    /**
     * openid查询 用户的问题
     *
     * @param request
     * @return
     */
    @Override
    public APIResponse<List<Question>> findQuestionByOpenid(CommentsRequest request) {

        List<Question> questionList = questionDao.findByOpenid(request.getOpenid());
        return APIResponse.success(questionList);
    }

    /**
     * 查询用户的评论
     * 带出问题
     * @param request
     * @return
     */
    @Override
    public APIResponse<List<CommentsResponse>> findCommentsByOpenid(CommentsRequest request) {
        return null;
    }
}
