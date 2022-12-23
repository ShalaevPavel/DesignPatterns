package org.example;

public class MultiplicationStrategy implements MathStrategy {
    @Override
    public double action(double a, double b) {
        return a * b;
    }

}
