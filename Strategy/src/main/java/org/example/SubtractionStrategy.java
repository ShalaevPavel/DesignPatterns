package org.example;

public class SubtractionStrategy implements MathStrategy {
    @Override
    public double action(double a, double b) {
        return a - b;
    }
}

