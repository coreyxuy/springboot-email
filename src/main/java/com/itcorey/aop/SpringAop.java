package com.itcorey.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import java.util.Arrays;
import java.util.UUID;

/**
 * @Classname SpringAop
 * @Description 接口日志追踪
 * @Date 2020/6/12 11:28
 * @Created by corey
 */
//@Aspect
//@Configuration
//public class SpringAop {
//
//    private static final Logger logger = LoggerFactory.getLogger(SpringAop.class);
//
//    /**
//     * 定义切点Pointcut
//     * 第一个*号：表示返回类型， *号表示所有的类型
//     * 第二个*号：表示类名，*号表示所有的类
//     * 第三个*号：表示方法名，*号表示所有的方法
//     * 后面括弧里面表示方法的参数，两个句点表示任何参数
//     */
//    @Pointcut("execution(* com.itcorey.controller.*.*(..))")
//    public void executionService() {}
//
//    /**
//     * 方法调用之前调用
//     *
//     * @param joinPoint
//     */
//    @Before(value = "executionService()")
//    public void doBefore(JoinPoint joinPoint) {
//        String requestId = String.valueOf(UUID.randomUUID());
//        MDC.put("requestId", requestId);
//        logger.info("=====>@Before：请求参数为：{}", Arrays.toString(joinPoint.getArgs()));
//    }
//
//    /**
//     * 方法之后调用
//     *
//     * @param joinPoint
//     * @param returnValue 方法返回值
//     */
//    @AfterReturning(pointcut = "executionService()", returning = "returnValue")
//    public void doAfterReturning(JoinPoint joinPoint, Object returnValue) {
//        logger.info("=====>@AfterReturning：响应参数为：{}", returnValue);        // 处理完请求，返回内容
//        MDC.clear();
//    }
//}
