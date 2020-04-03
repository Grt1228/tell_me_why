package com.unfbx.tellmewhy.service.comments.impl;

import com.unfbx.tellmewhy.dao.CommentsDao;
import com.unfbx.tellmewhy.exception.BusinessException;
import com.unfbx.tellmewhy.pojo.Comments;
import com.unfbx.tellmewhy.service.comments.CommentsService;
import com.unfbx.tellmewhy.vo.request.CommentsRequest;
import com.unfbx.tellmewhy.vo.response.CommentsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    private CommentsDao commentsDao;


    /**
     * 更新评论
     * 状态
     *
     * @param comments
     * @return
     */
    @Override
    public Comments update(Comments comments) {
        if(comments.getCid() == null){
            throw new BusinessException("评论标识不能为空");
        }
        Comments c = commentsDao.findByCid(comments.getCid());
        if(c==null){
            throw new BusinessException("评论不见了");
        }

        Comments upCom= commentsDao.update(comments);
        return upCom;
    }

    /**
     * 查询用户的评论列表
     *
     * @param request
     * @return
     */
    @Override
    public List<CommentsResponse> findByOpenid(CommentsRequest request) {
        List<Comments> commentsList = commentsDao.findByOpenid(request);

        return null;
    }

    /**
     * 新增一条评论
     *
     * @param comments
     * @return
     */
    @Override
    public Comments insert(Comments comments) {
        return null;
    }
}
