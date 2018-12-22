package command.remote;

public class HottubOnCommand implements Command {

    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void excuate() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }
}
