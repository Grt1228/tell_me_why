package com.unfbx.tellmewhy.controller.app;

import com.unfbx.tellmewhy.exception.BusinessException;
import com.unfbx.tellmewhy.pojo.Question;
import com.unfbx.tellmewhy.service.question.QuestionService;
import com.unfbx.tellmewhy.utils.APIResponse;
import com.unfbx.tellmewhy.vo.request.QuestionRequest;
import com.unfbx.tellmewhy.vo.response.QuestionResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 小程序端【问题】相关
 * @create GRT
 * @date 20190813
 *
 */
@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/question/{pageNum}/{pageSize}")
    public APIResponse<List<Question>> findAll(@PathVariable("pageNum") int pageNum,
                       @PathVariable("pageSize") int pageSize,
                       @RequestParam(name = "orderBy",required = true,defaultValue = "0") String orderBy,
                                               QuestionRequest questionRequest){

        questionRequest.setOrderBy(orderBy);
        questionRequest.setPageNum(pageNum);
        questionRequest.setPageSize(pageSize);
        return  questionService.findAll(questionRequest);
    }

    /**
     * 查询单条记录
     * 需要增加一次【点击】
     * @param id
     * @return
     */
    @GetMapping("/question/{id}")
    public APIResponse<QuestionResponse> findById(@PathVariable("id") Integer id){
        if (StringUtils.isEmpty(id.toString())){
            throw new BusinessException("id不能为空");
        }
        return questionService.findById(id);
    }

    /**
     * 新增
     * @param question
     * @return
     */
    @PostMapping("/question")
    public APIResponse create(@Validated @RequestBody Question question, BindingResult result){
        if(result.hasErrors()){
            throw new BusinessException(result.getAllErrors().get(0).getDefaultMessage());
        }
        return questionService.create(question);
    }

    /**
     * 赞
     * @param id
     * @return
     */
    @PutMapping("/question/like/{id}")
    public APIResponse like(Integer id){
        if (StringUtils.isEmpty(id.toString())){
            throw new BusinessException("问题标识不能为空");
        }
        return questionService.like(id);
    }

    /**
     * 踩
     * @param id
     * @return
     */
    @PutMapping("/question/unLike/{id}")
    public APIResponse unLike(Integer id){
        if (StringUtils.isEmpty(id.toString())){
            throw new BusinessException("问题标识不能为空");
        }
        return questionService.unLike(id);
    }

}
