package gr.aueb.cf.ch16Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalArgumentException {


       try {
           Class<?> clazz = Student.class;

           Class<?> studentClass = Class.forName("gr.aueb.cf.ch16Reflection.Student");

           Constructor<?> defaultConstructor = studentClass.getConstructor();

           Object studentInstance = defaultConstructor.newInstance();


           Student student = (Student) studentInstance;

           student.setId(1);
           student.setFirstname("Bob");
           student.setLastname("D.");

           System.out.println(student);


       } catch (Exception e) {
           e.printStackTrace();
       }



    }
}
