package command.remote;

public class HottubOffCommand implements Command {

    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void excuate() {
        hottub.cool();
        hottub.off();
    }
}
