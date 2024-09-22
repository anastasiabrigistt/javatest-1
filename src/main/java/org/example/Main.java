package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(3, 4);
        logger.info("3 + 4 = {}", sum);

        try {
            int result = calculator.div(10, 2);
            logger.info("10 / 2 = {}", result);
        } catch (ArithmeticException e) {
            logger.error("Ошибка при делении: {}", e.getMessage());
        }

        try {
            calculator.div(10, 0);
        } catch (ArithmeticException e) {
            logger.error("Ошибка при делении на ноль: {}", e.getMessage());
        }
    }
}
