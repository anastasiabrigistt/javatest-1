package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        if (b != 0) {
            return a / b;

        }
        else{
            logger.error("Ошибка деления на ноль.");
            throw new ArithmeticException("Невозможно разделить на ноль.");
        }

    }
}