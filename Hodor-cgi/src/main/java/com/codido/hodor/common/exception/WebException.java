package com.codido.hodor.common.exception;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.ord.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

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
            errorMsgStr = LottoStoreH5Constans.RESP_MSG_PARAM_ERROR;
        }
        BaseResp baseResp = new BaseResp();
        baseResp.setRespCode(LottoStoreH5Constans.RESP_CODE_PARAM_ERROR);
        baseResp.setRespMsg(errorMsgStr);
        return baseResp;
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResp execp(Exception exception) {
        exception.printStackTrace();
        logger.error("发生异常:" + exception.getLocalizedMessage());
        BaseResp baseResp = new BaseResp();
        baseResp.setRespCode(LottoStoreH5Constans.RESP_CODE_OTHER_ERROR);
        baseResp.setRespMsg(LottoStoreH5Constans.RESP_MSG_OTHER_ERROR);
        return baseResp;
    }
}
