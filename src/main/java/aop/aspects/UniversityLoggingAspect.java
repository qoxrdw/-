package aop.aspects;

import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(JoinPoint joinPoint) {

        System.out.println("Логгируем получение студентов BEFORE");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {

        System.out.println("Логгируем получение студентов AFTER RETURNING");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsAdvice(Throwable exception) {

        System.out.println("Логгируем получение студентов AFTER THROWING " + exception);
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Логгируем получение студентов AFTER");
    }
}
