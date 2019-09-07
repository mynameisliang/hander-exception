package cn.onlyone.handerexception.exception;

import cn.onlyone.handerexception.constants.ResultEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Map;

/**
 * @ClassName: Assert
 * @Description: 判断参数是否合法，不合法返回错误信息给前端，业务层也可以使用
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
public class Assert {
    //默认错误码 999
    private static int code= ResultEnum.SERVER_ERROR.getCode();

    //默认错误msg 服务端错误
    private static String msg = ResultEnum.SERVER_ERROR.getMsg();

    public Assert() {
    }


    /**
     * @title:  isBlank
     * @description:  判断字符串是否为空，包含""
     * @param param
     * @param code
     * @param msg
     * @return  void
     */
    public static void isBlank(String param, int code, String msg){
        if (StringUtils.isBlank(param)){
            throw new AssertException(code, msg);
        }
    }

    /**
     * @title:  isBlank
     * @description:  判断字符串是否为空，包含""
     * @param param
     * @param resultEnum
     * @return  void
     */
    public static void isBlank(String param, ResultEnum resultEnum){
        if (StringUtils.isBlank(param)){
            throw new AssertException(resultEnum);
        }
    }

    /**
     * @title:  isBlank
     * @description:  判断字符串是否为空，包含""，打印错误日志，并抛出服务端异常
     * @param param
     * @param msg
     * @return  void
     */
    public static void isBlank(String param, String msg){
        if (StringUtils.isBlank(param)){
            throw new LogException(msg);
        }
    }

    /**
     * @title:  isNull
     * @description:  判断对象是否为null
     * @param param
     * @param code
     * @param msg
     * @return  void
     */
    public static void isNull(Object param, int code, String msg){
        if (param==null){
            throw new AssertException(code, msg);
        }
    }

    /**
     * @title:  isNull
     * @description:  判断对象是否为null
     * @param param
     * @param resultEnum
     * @return  void
     */
    public static void isNull(Object param, ResultEnum resultEnum){
        if (param==null){
            throw new AssertException(resultEnum);
        }
    }

    /**
     * @title:  isNull
     * @description:  判断对象是否为null，打印错误日志，并抛出服务端异常
     * @param param
     * @param msg
     * @return  void
     */
    public static void isNull(Object param, String msg){
        if (param==null){
            throw new LogException(msg);
        }
    }

    /**
     * @title:  isNotNull
     * @description:  判断对象是否不为null
     * @param param
     * @param code
     * @param msg
     * @return  void
     */
    public static void isNotNull(Object param, int code, String msg){
        if (param!=null){
            throw new AssertException(code, msg);
        }
    }

    /**
     * @title:  isNotNull
     * @description:  判断对象是否不为null
     * @param param
     * @param resultEnum
     * @return  void
     */
    public static void isNotNull(Object param, ResultEnum resultEnum){
        if (param!=null){
            throw new AssertException(resultEnum);
        }
    }

    /**
     * @title:  isNotNull
     * @description:  判断对象是否不为null，打印错误日志，并抛出服务端异常
     * @param param
     * @param msg
     * @return  void
     */
    public static void isNotNull(Object param, String msg){
        if (param!=null){
            throw new LogException(msg);
        }
    }

    /**
     * @title:  isEmpty
     * @description:  判断Collection集合为空
     * @param param
     * @param code
     * @param msg
     * @return  void
     */
    public static void isEmpty(Collection param, int code, String msg){
        if (param==null || param.size()==0){
            throw new AssertException(code, msg);
        }
    }

    /**
     * @title:  isEmpty
     * @description:  判断Collection集合为空
     * @param param
     * @param resultEnum
     * @return  void
     */
    public static void isEmpty(Collection param, ResultEnum resultEnum){
        if (param==null || param.size()==0){
            throw new AssertException(resultEnum);
        }
    }

    /**
     * @title:  isEmpty
     * @description:  判断Collection集合为空，打印错误日志，并抛出服务端异常
     * @param param
     * @param msg
     * @return  void
     */
    public static void isEmpty(Collection param, String msg){
        if (param==null || param.size()==0){
            throw new LogException(msg);
        }
    }

    /**
     * @title:  isEmpty
     * @description:  判断Map集合为空
     * @param param
     * @param code
     * @param msg
     * @return  void
     */
    public static void isEmpty(Map param, int code, String msg){
        if (param==null || param.size()==0){
            throw new AssertException(code, msg);
        }
    }

    /**
     * @title:  isEmpty
     * @description:  判断Map集合为空
     * @param param
     * @param resultEnum
     * @return  void
     */
    public static void isEmpty(Map param, ResultEnum resultEnum){
        if (param==null || param.size()==0){
            throw new AssertException(resultEnum);
        }
    }

    /**
     * @title:  isEmpty
     * @description:  判断Map集合为空，打印错误日志，并抛出服务端异常
     * @param param
     * @param msg
     * @return  void
     */
    public static void isEmpty(Map param, String msg){
        if (param==null || param.size()==0){
            throw new LogException(msg);
        }
    }

    /**
     * @title:  isLessThanZero
     * @description:  判断Integer是否小于0
     * @param param
     * @param code
     * @param msg
     * @return  void
     */
    public static void isLessThanZero(Integer param, int code, String msg){
        if (param==null || param < 0){
            throw new AssertException(code, msg);
        }
    }

    /**
     * @title:  isLessThanZero
     * @description:  判断Integer是否小于0
     * @param param
     * @param resultEnum
     * @return  void
     */
    public static void isLessThanZero(Integer param, ResultEnum resultEnum){
        if (param==null || param < 0){
            throw new AssertException(resultEnum);
        }
    }

    /**
     * @title:  isLessThanZero
     * @description:  判断Integer是否小于0，打印错误日志，并抛出服务端异常
     * @param param
     * @param msg
     * @return  void
     */
    public static void isLessThanZero(Integer param, String msg){
        if (param==null || param < 0){
            throw new LogException(msg);
        }
    }

    /**
     * @title:  isLessThanOrEqualZero
     * @description:  判断Integer是否小于等于0
     * @param param
     * @param code
     * @param msg
     * @return  void
     */
    public static void isLessThanOrEqualZero(Integer param, int code, String msg){
        if (param==null || param <= 0){
            throw new AssertException(code, msg);
        }
    }

    /**
     * @title:  isLessThanOrEqualZero
     * @description:  判断Integer是否小于等于0
     * @param param
     * @param resultEnum
     * @return  void
     */
    public static void isLessThanOrEqualZero(Integer param, ResultEnum resultEnum){
        if (param==null || param <= 0){
            throw new AssertException(resultEnum);
        }
    }

    /**
     * @title:  isLessThanOrEqualZero
     * @description:  判断Integer是否小于等于0，打印错误日志，并抛出服务端异常
     * @param param
     * @param msg
     * @return  void
     */
    public static void isLessThanOrEqualZero(Integer param, String msg){
        if (param==null || param <= 0){
            throw new LogException(msg);
        }
    }

}
