package org.example;

public abstract class State {
    protected DBConnection dbConnection_;

    public State(DBConnection dbConnection) {
        dbConnection_ = dbConnection;
    }

    public abstract void open();
    public abstract void process();
    public abstract void close();




}



