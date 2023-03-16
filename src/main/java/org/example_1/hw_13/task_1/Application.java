package org.example_1.hw_13.task_1;
/* Task 1
В классе Application создать массив чисел int numbers = new int[]{3, 7, 9, 21, 14, 15}
Проитерироваться по массиву и сделать следующее: поделить число 100 на (numbers[i] - 9)
Если в процессе работы программы возможна ошибка - отловить ее и вывести в консоль:
'При обработке элемента №(здесь должен быть номер элемента) возникла ошибка: ' + exception.getMessage()
Gосле выведения текста в консоль, программа должна продолжить работу.
*/
public class Application {
    public static void main(String[] args) {

        int[] number = new int[]{3, 7, 9, 21, 14, 15};
        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(100 / (number[i] - 9));
            } catch (ArithmeticException exception) {
                System.out.println("При обработке элемента (2) возникла ошибка:" + exception.getMessage());
            }

        }
    }
}
