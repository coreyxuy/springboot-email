package com.itcorey.enumCode;

import lombok.Getter;

/**
 * @Classname ResultCodeEnum
 * @Description 统一返回泛型类
 * @Date 2020/6/4 18:40
 * @Created by corey
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(true,20000,"成功"),
    UNKNOWN_ERROR(false,20001,"未知错误"),
    PARAM_ERROR(false,20002,"参数错误"),
    ;

    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

}
