package TemplateMethodDriveTransport;

public abstract class Transport {
    public void exist(){
        System.out.println(arrive());
        System.out.println(leave());
        refuel();
    }
    public abstract String arrive();
    public abstract String leave();
    public abstract void refuel();


}
