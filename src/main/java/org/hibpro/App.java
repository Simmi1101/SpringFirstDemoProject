package org.hibpro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //creates the container and configuration is mentioned here
         ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //Here, it gives the object
         Alien obj=(Alien) context.getBean("alien");
         System.out.println(obj.getAge());
            System.out.println("Salary is:"+ obj.getSalary());
        obj.code();
        Desktop desktop=(Desktop)context.getBean("com2");
    }
}
