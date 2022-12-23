package org.example;

public class OpenState extends State{

    public OpenState(DBConnection dbConnection) {
        super(dbConnection);
    }
    @Override
    public void open() {
        System.out.println("Open");


    }

    @Override
    public void process() {

    }

    @Override
    public void close() {
        System.out.println("Close");
        dbConnection_.SetState(new OpenState(dbConnection_));

    }
}
