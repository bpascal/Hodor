package com.codido.hodor.api.common.exception;

import com.codido.hodor.api.common.bean.resp.BaseResp;
import com.codido.hodor.api.common.constans.AppConstans;
import com.codido.hodor.core.common.util.JBUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 统一异常处理接口
 */
@ControllerAdvice
public class WebException {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(WebException.class);


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public BaseResp exeMethodArgEcp(MethodArgumentNotValidException exception) {
        exception.printStackTrace();
        String errorMsgStr = "";
        List<ObjectError> errors = exception.getBindingResult().getAllErrors();
        if (!JBUtil.isListEmpty(errors)) {
            errorMsgStr = errors.get(0).getDefaultMessage();
        } else {
            errorMsgStr = AppConstans.RESP_MSG_PARAM_ERROR;
        }
        BaseResp baseResp = new BaseResp();
        baseResp.setRespCode(AppConstans.RESP_CODE_PARAM_ERROR);
        baseResp.setRespMsg(errorMsgStr);
        return baseResp;
    }

    @ExceptionHandler(value = LoginException.class)
    @ResponseBody
    public BaseResp jsonErrorHandler(HttpServletRequest req, LoginException e) throws Exception {
        BaseResp resp = new BaseResp();
        resp.setRespCode(AppConstans.RESP_CODE_TOKEN_ERROR);
        resp.setRespMsg(AppConstans.RESP_MSG_TOKEN_ERROR);
        return resp;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResp execp(Exception exception) {
        exception.printStackTrace();
        logger.error("发生异常:" + exception.getLocalizedMessage());
        BaseResp baseResp = new BaseResp();
        baseResp.setRespCode(AppConstans.RESP_CODE_OTHER_ERROR);
        baseResp.setRespMsg(AppConstans.RESP_MSG_OTHER_ERROR);
        return baseResp;
    }
}
