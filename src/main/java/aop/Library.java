package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Dictionary;
import java.util.Hashtable;

@Component("libraryBean")
public class Library {

    public void getBook() {
        System.out.println("Взяли книгу");
        System.out.println("---------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Добавили книгу");
        System.out.println("---------------------------");
    }


    public String returnBook() {
        System.out.println("Вернули книгу");
        System.out.println("---------------------------");
        if (true) {
            throw new NullPointerException();
        }
        return "книга";
    }

}
