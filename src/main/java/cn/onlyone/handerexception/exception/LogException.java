package cn.onlyone.handerexception.exception;

import cn.onlyone.handerexception.constants.ResultEnum;

/**
 * @ClassName: LogException
 * @Description: TODO
 * @Author liangjie
 * @Date 2019/9/5
 * @Version 1.0
 * @Since JDK1.8
 */
public class LogException extends RuntimeException{
    //默认错误码 999
    private static int code= ResultEnum.SERVER_ERROR.getCode();

    //默认错误msg 服务端错误
    private static String msg = ResultEnum.SERVER_ERROR.getMsg();

    public LogException() {
    }

    public LogException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public LogException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        LogException.code = code;
    }

    public static String getMsg() {
        return msg;
    }

    public static void setMsg(String msg) {
        LogException.msg = msg;
    }
}
