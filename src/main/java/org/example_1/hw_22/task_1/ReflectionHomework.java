package org.example_1.hw_22.task_1;




import org.apache.commons.lang3.RandomUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

// ну все получилось!
public class ReflectionHomework {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        PersonalInfo personalInfo = new PersonalInfo("Ivan", "Petrov", 53, true);

        // имея объект personalInfo, c помощью рефлексии создайте новый объект такого же типа,
        // заполните поля типа рандомными данными (используйте рандомные генераторы, как обсуждали на занятии)
        Class<?> clazz = personalInfo.getClass();
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackageName());
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();


        Object reflectionPersonalInfo = null;
        for (Constructor<?> declaredConstructor : declaredConstructors ) {
            if (declaredConstructor.getParameterCount() == 0) {
                reflectionPersonalInfo = declaredConstructor.newInstance();
            }
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields ) {
            declaredField.setAccessible(true);
            System.out.printf("Field %s has type %s", declaredField.getName(), declaredField.getType().getName());
            System.out.println();

            if (declaredField.getName().equals("name")) {
                declaredField.set(reflectionPersonalInfo, "Victor");
            }
            if (declaredField.getName().equals("surname")) {;
                declaredField.set(reflectionPersonalInfo, "Ivanov");
            }
            if (declaredField. getName().equals("age")) {
                declaredField.set(reflectionPersonalInfo, 42);

            }
            if (declaredField.getName().equals("isMarried")) {
                declaredField.set(reflectionPersonalInfo, false);
            }

        }

        System.out.println(reflectionPersonalInfo);



    }

}
