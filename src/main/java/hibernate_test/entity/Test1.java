package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {

            Session session = factory.getCurrentSession();

//            Employee emp = new Employee("Alex", "Ivanov", "sales", 300);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();


// 123
            // 345

        } finally {
            factory.close();
        }
    }
}
