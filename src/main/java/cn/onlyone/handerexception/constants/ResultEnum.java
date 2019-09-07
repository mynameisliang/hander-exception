package cn.onlyone.handerexception.constants;

/**
 * @ClassName: ResultEnum
 * @Description: 响应状态码和提示枚举类
 * @Author liangjie
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
public enum ResultEnum {
    SERVER_ERROR(999, "服务器错误"),
    SUCCESS(200, "SUCCESS"),
    STRING_NULL(411,"String is null"),
    OBJECT_NULL(412,"Object is null"),
    COLLECTION_NULL(413,"Collection is null"),
    MAP_NULL(414,"Map is null"),
    INTEGER_LESS_THAN_ZERO(415,"Integer is less then zero"),
    INTEGER_LESS_THAN_OR_EQUAL_ZERO(416,"Integer is less then or equal zero");

    private Integer code;//状态码

    private String msg;//获得提示信息

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
