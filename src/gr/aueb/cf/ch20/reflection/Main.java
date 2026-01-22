package gr.aueb.cf.ch20.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Teacher.class;             // uninitialized static fields
        Class<?> aClass = Class.forName("gr.aueb.cf.ch20.reflection.Teacher");      //initialized static fields. We'll use it for driver installation.

        Constructor<?>[] publicConstructors = Teacher.class.getConstructors();       // public constructor
        Constructor<?>[] constructorsList = clazz.getDeclaredConstructors();         // all constructors (even private)

        Constructor<?> defaultConstructor = clazz.getDeclaredConstructor();          // default constructor
        defaultConstructor.setAccessible(true);             // we make them accessible so that we can use it. even if private.

        Teacher teacher = (Teacher) defaultConstructor.newInstance();

        Constructor<?> longConstructor = Teacher.class.getConstructor(Long.class);  // take the constructor which has only Long id
        Constructor<?> overloadedConstructor = Teacher.class.getConstructor(Long.class, String.class, String.class);

        Method sayHello = clazz.getMethod("sayHello");
        sayHello.invoke(teacher);

        //this principle is used in frameworks.
    }
}
