package org.example_1.hw_24.Student;

import org.apache.poi.ss.formula.ptg.GreaterThanPtg;

import java.util.ArrayList;
public class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentCheck sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student("3", "Ivan", 'm', 28, 7.2);
        Student st2 = new Student("2", "Dima", 'm', 33, 8.6);
        Student st3 = new Student("1", "Marina", 'f', 25, 9.1);
        Student st4 = new Student("4", "Ira", 'f', 22, 7);
        Student st5 = new Student("3", "Maks", 'm', 27, 9);
        Student st6 = new Student("5", "Olga", 'f', 31, 8.4);
        Student st7 = new Student("4", "Piotrze", 'm', 35, 5.2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, new checkOverGrade());
        System.out.println("--------------------------");
        info.testStudents(students, new StudentCheck() {
            @Override
            public boolean check(Student st) {
                return st.getAge() > 30;
            }
        });
        System.out.println("--------------------------");
        info.testStudents(students, (Student st) -> {
            return st.getAge() > 30;
        });
    }
}

interface StudentCheck {
    boolean check(Student st);
}

class checkOverGrade implements StudentCheck {
    @Override
    public boolean check(Student st) {
        return st.avgGrade > 8;
    }
    

}
