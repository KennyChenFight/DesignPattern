package command.undo;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excuate() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
