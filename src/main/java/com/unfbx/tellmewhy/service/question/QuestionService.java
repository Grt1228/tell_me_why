package com.unfbx.tellmewhy.service.question;

import com.unfbx.tellmewhy.pojo.Question;
import com.unfbx.tellmewhy.utils.APIResponse;
import com.unfbx.tellmewhy.vo.request.QuestionRequest;
import com.unfbx.tellmewhy.vo.response.QuestionResponse;

import java.util.List;

/**
 * 【问题】相关
 * @create GRT
 * @date 20190813
 *
 */
public interface QuestionService {
    /**
     * 查询所有的问题
     * @param request
     * @return
     */
    APIResponse<List<Question>> findAll(QuestionRequest request);

    /**
     * 问题id查询
     * 查询评论（附带评论赞数）
     * 暂时不做附带灭数
     * @param id
     * @return
     */
    APIResponse<QuestionResponse> findById(Integer id);

    /**
     * 新增
     * @param question
     * @return
     */
    APIResponse create(Question question);

    /**
     * 赞
     * @param id
     * @return
     */
    APIResponse like(Integer id);

    /**
     * 踩
     * @param id
     * @return
     */
    APIResponse unLike(Integer id);

    /**
     * 置顶
     * @param id
     * @return
     */
    APIResponse isTop(Integer id);

    /**
     * 取消置顶
     * @param id
     * @return
     */
    APIResponse cancelTop(Integer id);
}
