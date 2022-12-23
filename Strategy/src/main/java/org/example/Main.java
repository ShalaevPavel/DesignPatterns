package org.example;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AdditionStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new SubtractionStrategy());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new MultiplicationStrategy());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}