package com.github.farewell12345.result;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import java.io.Serializable;

public class Response <T> implements Serializable {
    private static final Log log = LogFactory.getLog(Response.class);
    /**
     * 是否响应成功
     */
    private Boolean success;
    /**
     * 响应状态码
     */
    private int code;
    /**
     * 响应数据
     */
    private T data;
    /**
     * 错误信息
     */
    private String message;

    /**
     * 有参构造器
     * @param success:Boolean
     * @param code:int
     * @param msg:String
     * @param data:T
     */
    public Response(Boolean success, ResponseFactoryImpl.Code code, String msg, T data) {
        if (code.ordinal() > 400){
            log.warn("request error->codename:"+code.name()+",data:"+data+",msg:"+msg);
        }
        this.success = success;
        this.code = code.status;
        this.message = msg;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
