package org.example;

public class CloseState extends State{

    public CloseState(DBConnection dbConnection) {
        super(dbConnection);
    }

    @Override
    public void open() {
        System.out.println("Open");
        dbConnection_.SetState(new OpenState(dbConnection_));

    }

    @Override
    public void process() {

    }

    @Override
    public void close() {
        System.out.println("Open");
        dbConnection_.SetState(new CloseState(dbConnection_));

    }
}
