package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @AfterReturning("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("return type = " + methodSignature.getReturnType());

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj : args) {
                if (obj instanceof Book) {
                    System.out.println("Информация о книге: название " + ((Book) obj).getName()
                            + " автор " + ((Book) obj).getAuthor());
                }
            }
        }

        System.out.println("лог номер 1");
    }



}
