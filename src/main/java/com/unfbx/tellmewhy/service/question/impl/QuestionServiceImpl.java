package com.unfbx.tellmewhy.service.question.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unfbx.tellmewhy.constant.ConstValue;
import com.unfbx.tellmewhy.dao.CommentsDao;
import com.unfbx.tellmewhy.dao.QuestionDao;
import com.unfbx.tellmewhy.exception.BusinessException;
import com.unfbx.tellmewhy.pojo.Comments;
import com.unfbx.tellmewhy.pojo.Question;
import com.unfbx.tellmewhy.service.question.QuestionService;
import com.unfbx.tellmewhy.utils.APIResponse;
import com.unfbx.tellmewhy.vo.request.CommentsRequest;
import com.unfbx.tellmewhy.vo.request.QuestionRequest;
import com.unfbx.tellmewhy.vo.response.QuestionResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 【问题】相关
 * @create GRT
 * @date 20190813
 *
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Autowired
    private CommentsDao commentsDao;

    @Override
    public APIResponse<List<Question>> findAll(QuestionRequest request) {

        String orderBy = ConstValue.OrderBy.codeOf(request.getOrderBy()).getValue();
        request.setOrderBy(orderBy);
        PageHelper.startPage(request.getPageNum(), request.getPageSize());

        List<Question> questionList = questionDao.findAll(request);
        PageInfo<Question> pageInfo = new PageInfo<>(questionList);

        return APIResponse.success("成功",pageInfo);
    }

    @Override
    public APIResponse<QuestionResponse> findById(Integer id) {
        if(id == null){
            throw new BusinessException("这个问题不见了~");
        }
        Question question = questionDao.findById(id);

        if(question == null){
            throw new BusinessException("这个问题不见了~");
        }
        //默认点击查看详情带出8条有效评论
        PageHelper.startPage(1,8);
        CommentsRequest request = new CommentsRequest();
        request.setQid(id);
        request.setStatus(ConstValue.Status.YES.getCode());
        List<Comments> commentsList = commentsDao.findByQid(request);

        QuestionResponse response = new QuestionResponse();
        BeanUtils.copyProperties(question,response);
        //buildResponse
        buildResponse(response,commentsList);
        //增加点击次数
        hit(id);
        return APIResponse.success(response);
    }


    @Override
    public APIResponse create(Question question) {
        question.setStatus(ConstValue.Status.YES.getCode());
        question.setAllowComment(String.valueOf(ConstValue.AllowComment.YES.getCode()));
        question.setIsTop(String.valueOf(ConstValue.IsTop.NO.getCode()));
        int i = questionDao.insert(question);
        if(i<=0){
            throw new BusinessException("创建问题出错");
        }
        return APIResponse.success("创建问题成功");
    }

    @Override
    @Transactional
    public APIResponse like(Integer id) {
        Question question = questionDao.findById(id);
        if(question==null){
            throw new BusinessException("问题好像不见了~");
        }
        int i = questionDao.like(id,question.getLikeNum() +1);
        if(i<=0){
            return APIResponse.fail("失败");
        }
        return APIResponse.success("成功");
    }

    @Override
    @Transactional
    public APIResponse unLike(Integer id) {
        Question question = questionDao.findById(id);
        if(question==null){
            throw new BusinessException("问题好像不见了~");
        }
        int i = questionDao.unLike(id,question.getUnLikeNum()+1);
        if(i<=0){
            return APIResponse.fail("失败");
        }
        return APIResponse.success("成功");
    }

    @Transactional
    public void hit(Integer id) {
        Question question = questionDao.findById(id);
        if(question==null){
            throw new BusinessException("问题好像不见了~");
        }
        int i = questionDao.hit(id,question.getHits()+1);
        if(i <= 0){
            questionDao.hit(id,question.getHits()+1);
        }
    }

    /**
     * 组装返回值
     * @param response
     * @param commentsList
     */
    private void buildResponse(QuestionResponse response, List<Comments> commentsList) {
        response.setComments(commentsList);
    }

}
