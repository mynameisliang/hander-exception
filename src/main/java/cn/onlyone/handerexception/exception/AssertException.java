package cn.onlyone.handerexception.exception;


import cn.onlyone.handerexception.constants.ResultEnum;

/**
 * @ClassName: AssertException
 * @Description: 断言异常
 * @Author liangjie
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
public class AssertException extends RuntimeException {

    private static int code= ResultEnum.SERVER_ERROR.getCode();
    private static String msg= ResultEnum.SERVER_ERROR.getMsg();



    public AssertException() {

    }

    public AssertException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public AssertException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

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
}
