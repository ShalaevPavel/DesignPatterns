package org.example;

public class DBConnection {


    void open() {
        System.out.println("Opening database connection...");
    }

    void process() {
        System.out.println("Processing database connection...");
    }

    void close() {
        System.out.println("Closing database connection...");
    }

    void SetState(State state) {
        State state_ = state;
    }
}
