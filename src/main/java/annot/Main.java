package annot;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        Cat cat = new Cat("Alex");

        if (cat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("Important");
        }else {
            System.out.println("Not Important");
        }

        for (Method method : cat.getClass().getDeclaredMethods()){
            if (method.isAnnotationPresent(RunImediately.class)){
                RunImediately annotation = method.getAnnotation(RunImediately.class);
                for (int itr=0; itr < annotation.times(); itr++){
                    System.out.println(method.invoke(cat));
                }
            }
        }

        for (Field field : cat.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(ImportantString.class)){
                field.setAccessible(true);
                Object obj = field.get(cat);
                if (obj instanceof String){
                    System.out.println(obj.toString());
                }
            }
        }


    }
}
