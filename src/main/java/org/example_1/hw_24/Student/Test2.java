package org.example_1.hw_24.Student;

import org.jetbrains.annotations.NotNull;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        def((String str) ->  {return str.length();});
    }
}
interface I {
    int abc(String s);
}
