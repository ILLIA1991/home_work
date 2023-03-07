package org.example_1.hw_11.task_4;

import org.apache.commons.lang3.StringUtils;

public class Polindrom {
    public static void main(String[] args) {
        String toChenck = "tod dot";
        String reversed = StringUtils.reverse(toChenck);
        System.out.println(reversed.equals(toChenck));
    }
}
