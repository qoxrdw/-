package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class NewLoggingAspect {

    @Around("aop.aspects.MyPointcuts.returnBookMethod()")
    public Object AroundReturnBookMethod(ProceedingJoinPoint joinPoint)
    throws  Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("В библиотеку пытаются вернуть книгу AROUND");
        Object targetMethodResult = null;
        try {
            targetMethodResult = joinPoint.proceed();
        } catch (Exception e) {
            System.out.println("Было поймано исключение в AROUND " + e);
            throw e;
        }

        System.out.println("В библиотеку вернули книгу AROUND");


        return targetMethodResult;
    }
}
