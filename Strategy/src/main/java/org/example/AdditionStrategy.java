package org.example;

public class AdditionStrategy implements MathStrategy {
    @Override
    public double action(double a, double b) {
        return a + b;
    }

}
