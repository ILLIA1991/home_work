package org.example_1.hw_25.Task_6;

import org.apache.logging.log4j.util.PropertySource;

import java.util.*;

public class UserReverse {
    public static void main(String[] args) {
        List <User> users = new ArrayList<>();
        users.add(new User("Андрей", "Андреев"));
        users.add(new User("Богдан", "Бородин"));
        users.add(new User("Вальдемар", "Винокур"));
        users.add(new User("Григорий", "Григораж"));

        System.out.println(users);
        System.out.println();

        // этот компаратор всегда возвращает 0, это значит что юзеры по его мнению равны
        Collections.sort(users, new Comparator< User >() {
            @Override
            public int compare(User o1, User o2) {
                return 0;
            }
        });
        // здесь сортировка норм
        Collections.sort(users, (o1, o2) -> (o2.getName().compareTo(o1.getName())));
        System.out.println("Обратный порядок => " + users);


    }

}
