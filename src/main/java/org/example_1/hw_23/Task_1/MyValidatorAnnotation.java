package org.example_1.hw_23.Task_1;

import org.example_1.hw_23.Task_2.OnlyDigits;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

// предложу немного исправить имя - это в первую очередь валидатор, поэтому предложу MyAnnotationValidator
public class MyValidatorAnnotation {

    private static final Pattern ONLY_LETTERS_PATTERN = Pattern.compile("^[a-zA-Z]*$");
    private static final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private static final Pattern ONLY_DIGITS_PATTERN = Pattern.compile("[0-9]+$");

    public void validate(Object obj) {
        // плиз, сделай форматирование кода
        for (Field declaredField : obj.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);

            for (Annotation annotation : declaredField.getAnnotations()) {
                validateLettersOnly(obj, declaredField, annotation);
                validateEmail(obj, declaredField, annotation);
                validateOnlyDigits(obj, declaredField, annotation);
            }
        }
    }

    private void validateOnlyDigits(Object obj, Field declaredField, Annotation annotation) {
        if (annotation.annotationType().equals(OnlyDigits.class)) {
            try {
                String value = (String) declaredField.get(obj);
                if (!ONLY_DIGITS_PATTERN.matcher(value).matches()) {
                    // здесь не хватает второго аргумента со значением
                    String message = String.format("Field %s with value %s contain only numbers  ", declaredField.getName(), value);
                    throw new ValidationException(message);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private void validateEmail(Object obj, Field declaredField, Annotation annotation) {
        if (annotation.annotationType().equals(Email.class)) {
            try {
                String value = (String) declaredField.get(obj);
                if (!EMAIL_ADDRESS_PATTERN.matcher(value).matches()) {
                    // здесь не хватает второго аргумента со значением
                    String message = String.format("Field %s with value %s contain only 'email' ", declaredField.getName(), value);
                    throw new ValidationException(message);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }

    private void validateLettersOnly(Object obj, Field declaredField, Annotation annotation) {
        if (annotation.annotationType().equals(LettersOnly.class)) {
            try {
                String value = (String) declaredField.get(obj);
                if (!ONLY_LETTERS_PATTERN.matcher(value).matches()) {
                    // здесь не хвататет второго аргумента со значением
                    String message = String.format("Field %s with value %s contain only letters", declaredField.getName(), value);
                    throw new ValidationException(message);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
