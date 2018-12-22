package command.simpleremote;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();

        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
