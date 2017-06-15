package com.example.mvc.domain;

/**
 * Created by Hosh on 2017-05-26.
 */
public enum ResponseCode
{
    CODE_OK(0),
    CODE_ERROR_VALIDATION(10);

    Integer code;

    ResponseCode(Integer code)
    {
        this.code = code;
    }

    public Integer getCode()
    {
        return code;
    }
}
