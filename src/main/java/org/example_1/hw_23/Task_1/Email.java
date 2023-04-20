package org.example_1.hw_23.Task_1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* Task 1
У нас в проекте появилась аннотация @Email - провалидируйте поля, помеченные этой аннотацией (также через regexp)
и если поле невалидно - бросайте ошибку
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
    String value() default "Parampampam";
}
