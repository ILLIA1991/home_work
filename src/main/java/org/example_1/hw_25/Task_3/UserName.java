package org.example_1.hw_25.Task_3;

// вынесите этот интерфейс в отдельный файл и пометьте его нужной аннотацией
@FunctionalInterface
interface UserName {
    User create(String name);
}
