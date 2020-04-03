package com.unfbx.tellmewhy.controller.app;

import com.unfbx.tellmewhy.service.comments.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小程序端【评论】相关
 * @create GRT
 * @date 20190813
 *
 */
@RestController
public class CommentsController {

    @Autowired
    private CommentsService commentsService;


}
