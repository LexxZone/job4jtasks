package ru.job4j.calculator;

/**
 * Simple calculator.
 *
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Calculator {
    /**
     * result - result of arithmetic operation.
     */
    private double result;

    /**
     * Method makes sum of first and second arguments.
     * @param first
     *          first double argument
     * @param second
     *          second double argument
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Subtracting.
     * Method subtracts second double argument from
     * first double argument.
     * @param first
     *          first double argument
     * @param second
     *          second double argument
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method divides first argument on second argument.
     * @param first
     *          first double argument
     * @param second
     *          second double argument
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiplies first argument and second argument.
     * @param first
     *          first double argument
     * @param second
     *          second double argument
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Returns private double result.
     * @return result
     */
    public double getResult() {
        return this.result;
    }
}
