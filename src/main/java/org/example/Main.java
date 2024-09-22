package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int sum = Calculator.sum(3, 4);
        logger.info("3 + 4 = {}", sum);

        try {
            int result = Calculator.div(10, 2);
            logger.info("10 / 2 = {}", result);
        } catch (ArithmeticException e) {
            logger.error("Ошибка при делении: {}", e.getMessage());
        }

        try {
            Calculator.div(10, 0);
        } catch (ArithmeticException e) {
            logger.error("Ошибка при делении на ноль: {}", e.getMessage());
        }
    }
}
