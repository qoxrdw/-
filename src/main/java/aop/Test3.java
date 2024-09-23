package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("start");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("libraryBean", Library.class);

        try {
            library.returnBook();
        } catch (Exception e) {
            System.out.println("main обработал");
        }


        context.close();

        System.out.println("end");
    }


}
