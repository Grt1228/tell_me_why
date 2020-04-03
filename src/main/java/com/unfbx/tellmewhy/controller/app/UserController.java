package com.unfbx.tellmewhy.controller.app;

import com.unfbx.tellmewhy.exception.BusinessException;
import com.unfbx.tellmewhy.pojo.Question;
import com.unfbx.tellmewhy.service.user.UserService;
import com.unfbx.tellmewhy.utils.APIResponse;
import com.unfbx.tellmewhy.vo.request.CommentsRequest;
import com.unfbx.tellmewhy.vo.request.QuestionRequest;
import com.unfbx.tellmewhy.vo.response.CommentsResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 小程序端【用户】相关
 * @create GRT
 * @date 20190813
 *
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    /**
     * openid查询
     * @param request
     * @return
     */
    @GetMapping("/user/question/{openid}")
    public APIResponse<List<Question>> findQuestionByOpenid(CommentsRequest request){
        if (StringUtils.isEmpty(request.getOpenid())){
            throw new BusinessException("用户标识不能为空");
        }
        return userService.findQuestionByOpenid(request);

    }

    /**
     * openid查询
     * @param request
     * @return
     */
    @GetMapping("/user/comments/{openid}")
    public APIResponse<List<CommentsResponse>> findCommentsByOpenid(CommentsRequest request){
        if (StringUtils.isEmpty(request.getOpenid())){
            throw new BusinessException("用户标识不能为空");
        }
        return userService.findCommentsByOpenid(request);

    }
}
