package org.example_1.hw_12.task_3;
/* Task 3
Написать класс для проверки, является ли слово палиндромом, с помощью рекурсии.
При написании программы можно использовать методы s.charAt() и s.substring()
 */
public class Polindrom {
    public static void main(String[] args) {
        String s = "ILLIA";
        System.out.println(isPalindrome(s) ? "YES" : "NO");
    }
    private static boolean isPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0) {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
}
