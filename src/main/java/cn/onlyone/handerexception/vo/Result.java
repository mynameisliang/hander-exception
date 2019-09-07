package cn.onlyone.handerexception.vo;


import cn.onlyone.handerexception.constants.ResultEnum;

/**
 * @ClassName: Result
 * @Description: 返回响应数据格式
 * @Author liangjie
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
public class Result {
    private Integer code= ResultEnum.SUCCESS.getCode();
    private Object data;
    private String msg = ResultEnum.SUCCESS.getMsg();

    public Result() {
    }

    public Result(Object data){
        this.data = data;
    }

    public Result(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
