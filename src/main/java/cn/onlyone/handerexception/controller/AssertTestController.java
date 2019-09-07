package cn.onlyone.handerexception.controller;


import cn.onlyone.handerexception.constants.ResultEnum;
import cn.onlyone.handerexception.exception.Assert;
import cn.onlyone.handerexception.service.IAssertTestService;
import cn.onlyone.handerexception.util.ResultUtil;
import cn.onlyone.handerexception.vo.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: AssertTestController
 * @Description: 测试断言处理
 * @Author liangjie
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
@RestController
@RequestMapping(value = "/assert")
public class AssertTestController {

    @Autowired
    private IAssertTestService assertTestService;

    @RequestMapping(value = "success", method = RequestMethod.GET)
    public Result success(){
        return ResultUtil.success("正常");
    }

    /**
     * @title:  serverError
     * @description:  test serverError
     * @param
     * @return  cn.lj.httptest.vo.Result
     */
    @RequestMapping(value = "serverError", method = RequestMethod.GET)
    public Result serverError(){
        int i=1/0;
        return ResultUtil.success();
    }

    /**
     * @title:  isBlank
     * @description:  test isBlank
     * @param
     * @return  cn.lj.httptest.vo.Result
     */
    @RequestMapping(value = "isBlank", method = RequestMethod.GET)
    public Result isBlank(){
        String param="";
        Assert.isBlank(param, ResultEnum.STRING_NULL);
        return ResultUtil.success();
    }

    /**
     * @title:  isNull
     * @description:  test isNull
     * @param
     * @return  cn.lj.httptest.vo.Result
     */
    @RequestMapping(value = "isNull", method = RequestMethod.GET)
    public Result isNull(){
        Object param=null;
        Assert.isNull(param, ResultEnum.OBJECT_NULL);
        return ResultUtil.success();
    }

    /**
     * @title:  isLessThanZero
     * @description:  TODO
     * @param
     * @return  Result
     */
    @RequestMapping(value = "isLessThanZero", method = RequestMethod.GET)
    public Result isLessThanZero(){
        Object param=null;
        Assert.isLessThanZero(-1, ResultEnum.INTEGER_LESS_THAN_ZERO);
        return ResultUtil.success();
    }

    /**
     * @title:  serviceException
     * @description:  test serviceException
     * @param
     * @return  Result
     */
    @RequestMapping(value = "serviceException", method = RequestMethod.GET)
    public Result serviceException(){
        assertTestService.testServiceException();
        return ResultUtil.success();
    }

    /**
     * @title:  logException
     * @description:  TODO
     * @param
     * @return  Result
     */
    @RequestMapping(value = "logException", method = RequestMethod.GET)
    public Result logException(){
        Assert.isBlank("", ResultEnum.STRING_NULL.getMsg());
        return ResultUtil.success();
    }

}
