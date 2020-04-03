package com.unfbx.tellmewhy.handler;

import com.unfbx.tellmewhy.constant.ErrorConstant;
import com.unfbx.tellmewhy.exception.BusinessException;
import com.unfbx.tellmewhy.utils.APIResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理
 * Created by Donghua.Chen on 2018/4/20.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(BusinessException.class);

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public APIResponse businessException(Exception e){

        String msg = ErrorConstant.Common.ERROR;
        if (e instanceof BusinessException){
            msg = ((BusinessException) e).getMessage();
        }
        logger.error("find exception:e={}",e.getMessage());
        e.printStackTrace();
        return APIResponse.fail(msg);
    }

   @ExceptionHandler(value = Exception.class)
   @ResponseBody
   public APIResponse exception(Exception e){
        logger.error("find exception:e={}",e.getMessage());
        e.printStackTrace();
        return APIResponse.fail(ErrorConstant.Common.ERROR);
   }


    /***
     * 404处理
     * @param e
     * @return
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public APIResponse notFountHandler(HttpServletRequest request, NoHandlerFoundException e){
        String method = request.getMethod();
        String path = request.getRequestURI();
        Map<String,Object> data = new HashMap<>();
        data.put("method",method);
        data.put("path",path);
        return APIResponse.fail("404请求地址错误",data);
    }
}
