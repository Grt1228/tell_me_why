package com.unfbx.tellmewhy.dao;


import com.unfbx.tellmewhy.pojo.Comments;
import com.unfbx.tellmewhy.vo.request.CommentsRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *  评论相关数据库操作
 */
@Mapper
public interface CommentsDao {
    /**
     * 根据问题id查询问题下的回复
     * @param request
     * @return
     */
    List<Comments> findByQid(CommentsRequest request);

    /**
     * 根据openid查询个人回复
     * @param request
     * @return
     */
    List<Comments> findByOpenid(CommentsRequest request);

    /**
     * 查询单条记录
     * @param cid
     * @return
     */
    Comments findByCid(Integer cid);

    /**
     * 更新评论
     * @param comments
     * @return
     */
    Comments update(Comments comments);

    /**
     * 新增评论
     * @param comments
     * @return
     */
    int insert(Comments comments);

    /**
     * 根据父id，查询某一个评论下的评论
     * @param request
     * @return
     */
    List<Comments> findByParentid(CommentsRequest request);
}
