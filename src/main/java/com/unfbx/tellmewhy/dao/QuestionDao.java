package com.unfbx.tellmewhy.dao;

import com.unfbx.tellmewhy.pojo.Question;
import com.unfbx.tellmewhy.vo.request.QuestionRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionDao {

    List<Question> findAll(QuestionRequest request);

    int insert(Question question);

    Question findById(Integer id);

    int hit(Integer id,int hits);

    int like(Integer id,int likeNum);

    int unLike(Integer id, int unLikeNum);

    List<Question> findByOpenid(String openid);

    int top(Integer id);
    int cancelTop(Integer id);
}
