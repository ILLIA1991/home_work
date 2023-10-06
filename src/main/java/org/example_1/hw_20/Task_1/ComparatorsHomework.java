package org.example_1.hw_20.Task_1;

/*
Отсортируйте список данных по имени и фамлии пользователя, выведите в консоль
Отсортируйте список данных по дате рождения в порядке убывания, выведите в консоль
Отсортируйте список данных по имени, фамилии, дате рождения, выведите в консоль
 */

import org.example_1.hw_11.task_1.Phone;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ComparatorsHomework {
    public static void main(String[] args) {

         AccountInfo accountInfo = new AccountInfo("Ivan", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11));
         AccountInfo accountInfo1 = new  AccountInfo("Fedor", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(1990, 10, 11));
         AccountInfo accountInfo2 = new AccountInfo("Anna", "Ivanova", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 15));
         AccountInfo accountInfo3 = new AccountInfo("Egor", "Egorov", "607499636tr", "ivan@tu.by", LocalDate.of(1989, 2, 3));
         AccountInfo accountInfo4 = new AccountInfo("Andy23", "Aity", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11));
         AccountInfo accountInfo5 = new AccountInfo("Pavel", "Pavlov23", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11));

        List<AccountInfo> accountInfos = new ArrayList<>(List.of(accountInfo ,
                accountInfo1 , accountInfo2 , accountInfo3 , accountInfo4 , accountInfo5));
        Collections.sort(accountInfos);
        for (AccountInfo accountInfo22 : accountInfos) {
            System.out.println(accountInfo22.getName() + " "
                    + accountInfo22.getSurname() + " ");




        /*Comparator<AccountInfo> accountInfoComparator = Comparator.comparing(AccountInfo::getName)
                .thenComparing(AccountInfo::getEmail)
                .thenComparing(AccountInfo::getPhone)
                .thenComparing(AccountInfo::getDateOfBirth)
                .thenComparing(AccountInfo::getSurname)
                .reversed();


         System.out.print(accountInfos);

        Comparator<AccountInfo> lymbdaAccountInfo = (ak1, ak2) -> ak1.getDateOfBirth().compareTo(ak2.getDateOfBirth());
        accountInfos.sort(lymbdaAccountInfo);
        System.out.println(lymbdaAccountInfo);
        System.out.println(LocalDate.);


         //Collections.sort(accountInfos, accountInfoComparator);

        Set<AccountInfo> setAccountInfo = new TreeSet<>(accountInfoComparator);
        System.out.println(setAccountInfo);

         */


        }
    }
}
