package com.codido.hodor.common.handler;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.exception.LoginException;
import com.codido.hodor.common.exception.NoShopException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = LoginException.class)
    @ResponseBody
    public BaseResp jsonErrorHandler(HttpServletRequest req, LoginException e) throws Exception {
        BaseResp resp = new BaseResp();
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_TOKEN_ERROR);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_TOKEN_ERROR);
        return resp;
    }

    @ExceptionHandler(value = NoShopException.class)
    @ResponseBody
    public BaseResp jsonErrorHandler(HttpServletRequest req, NoShopException e) throws Exception {
        BaseResp resp = new BaseResp();
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_NOSHOP_ERROR);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_NOSHOP_ERROR);
        return resp;
    }

}
