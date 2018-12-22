package command.remote;

public class TV {

    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is on");
    }

    public void off() {
        System.out.println(location + " TV is off");
    }

    public void setInputChannel(int channel) {
        this.channel = channel;
        System.out.println(location + " TV is set for " + channel);
    }
}
