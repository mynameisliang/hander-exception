package cn.onlyone.handerexception.service.impl;

import cn.onlyone.handerexception.constants.ResultEnum;
import cn.onlyone.handerexception.exception.Assert;
import cn.onlyone.handerexception.service.IAssertTestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AssertTestSerciveImpl
 * @Description: TODO
 * @Author liangjie
 * @Date 2019/9/5
 * @Version 1.0
 * @Since JDK1.8
 */
@Service
public class AssertTestSerciveImpl implements IAssertTestService {
    
    /**
     * @title:  testServiceException
     * @description:  TODO
     * @param 
     * @return  void
     */
    @Override
    public void testServiceException() {
        Assert.isBlank("", ResultEnum.STRING_NULL);
    }
}
