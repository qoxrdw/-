package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* returnBook())")
    public void returnBookMethod() {};
}
