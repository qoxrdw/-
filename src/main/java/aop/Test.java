package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("libraryBean", Library.class);

        Book book = context.getBean("book", Book.class);
        library.addBook("Egor", book);

        library.getBook();

        context.close();
    }
}
