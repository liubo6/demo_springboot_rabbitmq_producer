package com.liubo.demo.rabbitmq.producer.exception;

import java.util.Map;

/**
 * 返回结果实例
 * Created by hzlbo on 2016/7/11.
 */
public class Result {
    private int code;
    private String msg;
    private Object data;
    private Map<String, Object> extraInfo;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Map<String, Object> getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Map<String, Object> extraInfo) {
        this.extraInfo = extraInfo;
    }
}
