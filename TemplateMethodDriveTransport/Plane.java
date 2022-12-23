package TemplateMethodDriveTransport;

public class Plane extends Transport {
    @Override
    public String arrive() {
        return "your plane landed";
    }

    @Override
    public String leave() {
        return "your plane took off";

    }

    @Override
    public void refuel() {
        System.out.println("Refueling with Jet-A");

    }
}
