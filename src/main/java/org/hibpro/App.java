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
        obj.code();
    }
}
