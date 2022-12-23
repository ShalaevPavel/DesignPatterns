package TemplateMethodDriveTransport;

public class Car extends Transport {
    @Override
    public String arrive() {
        return "your car arrived to the stop";

    }

    @Override
    public String leave() {
        return "your car got out of the stop";

    }

    @Override
    public void refuel() {
        System.out.println("Refueling with patrol...");
    }
}
