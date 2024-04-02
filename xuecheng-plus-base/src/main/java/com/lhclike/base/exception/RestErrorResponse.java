package com.lhclike.base.exception;

import java.io.Serializable;

/**
 * 错误响应参数包装
 * 实体类
 * 前端展示需求类
 * 和前端约定返回的异常信息
 */
public class RestErrorResponse implements Serializable {

    private String errMessage;

    public RestErrorResponse(String errMessage){
        this.errMessage= errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
