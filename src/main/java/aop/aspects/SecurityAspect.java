package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("лог номер 2");
    }
}
