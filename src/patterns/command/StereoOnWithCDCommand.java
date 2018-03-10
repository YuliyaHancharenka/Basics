package patterns.command;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.execute();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
