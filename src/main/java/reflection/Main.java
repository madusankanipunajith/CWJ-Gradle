package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Alex", 10);
        Class<? extends Cat> cls = cat.getClass();
        Field[] catFields = cls.getDeclaredFields();
        Method[] catMethods = cls.getDeclaredMethods();

        for (Field field : catFields){
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(cat, "Jorge");
            }
        }

        for (Method method : catMethods){
            if (method.getName().equals("staticMethod")){
                method.setAccessible(true);
                method.invoke(cat, 0);
            }

            if (method.getName().equals("privateStaticMethod")){
                method.setAccessible(true);
                method.invoke(cat);
            }
        }

        System.out.println(cat);
    }
}
