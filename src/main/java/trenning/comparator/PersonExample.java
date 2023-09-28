package trenning.comparator;

import java.util.Comparator;

public class PersonExample {
    public static void main(String[] args) {
        Comparator<Person> nameAndAgeComparator = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                // Сравниваем обьекты по имени и возрасту
                if(person1.getName().equals(person2.getName()) && person1.getAge() == person2.getAge()) {
                    return 0; //Обьекты считаются равными
                } else {
                    return -1;
                }
            }
        };

        Person person1 = new Person("Krazek", 95);
        Person person2 = new Person("Brzezek", 101);

        int result = nameAndAgeComparator.compare(person1, person2);

        if(result == 0) {
            System.out.println("Обьекты равны");
        } else {
            System.out.println("Обьекты не равны");
        }
    }
}
//        В этом примере мы создали анонимный класс, реализующий интерфейс Comparator<Person>,
//        и переопределили метод compare. Мы сравниваем объекты Person на основе их имени и возраста.
//        Если и имя, и возраст совпадают, мы считаем объекты равными и возвращаем 0;
//        в противном случае, мы считаем объекты не равными и возвращаем -1.
//
//        Затем мы создали два объекта Person и использовали наш компаратор для сравнения их на равенство.
