package com.lightofsms.girl.aop;

import com.lightofsms.girl.pojo.Result;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.lightofsms.girl.controller.GirlControlller.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(ProceedingJoinPoint joinPoint) {
//        logger.info("before");
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
////        HttpSession session = (HttpSession) attributes.getSessionMutex();
//
//        logger.info("url={}", request.getRequestURL());
//        logger.info("method={}", request.getMethod());
//        logger.info("ip={}", request.getRemoteAddr());
//        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        logger.info("args={}", joinPoint.getArgs());

        System.out.println("apo->before");
    }

    @After("log()")
    public void doafter() {

        System.out.println("apo->after");
    }

    //    获取返回的内容
    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {

        System.out.println("apo->returning");
    }

    //    环绕
    @Around("log()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
//        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
//        ServletRequestAttributes attribute = (ServletRequestAttributes) attributes;
//        HttpServletRequest request = attribute.getRequest();
//        String url = request.getRequestURL().toString();
//        String method = request.getMethod();
//        String uri = request.getRequestURI();
//        String queryString = request.getQueryString();
//        logger.info("请求开始, 各个参数, url: {}, method: {}, uri: {}, params: {}", url, method, uri, queryString);
//
////        long start = System.currentTimeMillis();
////        System.out.println("=====================");
//        // result的值就是被拦截方法的返回值

////        long end = System.currentTimeMillis();
//
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(result);
//        logger.info("请求结束，controller的返回值是 " + json);
//
//
////        System.out.println(start+'\n'+end);

//        System.out.println("模拟事物开始");
//        Object[] args = pjp.getArgs();
//
//        for (Object arg : args) {
//            if (arg instanceof_ Girl) {
//                ((Girl) arg).setName("新增" + ((Girl) arg).getName());
//            }
//        }
//        Object result = pjp.proceed();
//        System.out.println("执行方法后...");
//        return result;

//        long startTime = System.currentTimeMillis();

        Result result;

        System.out.println("apo->around");

        result = (Result<?>) pjp.proceed();

//        logger.info(pjp.getSignature() + " user time " + (System.currentTimeMillis() - startTime));
        return result;
    }
}
