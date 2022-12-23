package org.example;

public class Context {
    private MathStrategy strategy;

    public Context(MathStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double a, double b) {
        return strategy.action(a, b);
    }
}
